/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import com.mycompany.dto.DtoReturn;
import com.mycompany.dto.DtoSellerLogIn;
import com.mycompany.enums.Method;
import com.mycompany.enums.ResponseType;
import com.mycompany.exceptions.DoesNotExistException;
import com.mycompany.exceptions.IncorrectPasswordException;
import com.mycompany.model.MoSale;
import com.mycompany.serviceImpl.ServiceImplSeller;
import com.mycompany.supports.Request;
import com.mycompany.supports.Response;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author carlos
 */
public class ClientHandler extends Thread {
    
    private final ObjectInputStream in; 
    private final ObjectOutputStream out; 
    private final Socket s; 
    private ServiceImplSeller serviceSeller;
    
    public ClientHandler(Socket s, ObjectInputStream in, ObjectOutputStream out) {
        this.s = s;
        this.in = in;
        this.out = out;
        serviceSeller = new ServiceImplSeller();
    }
    
    @Override
    public void run(){
        try{
            Request request = (Request) in.readObject();
            switch(request.getService()){
                case SELLER:
                    if(request.getMethod() == Method.LOG_IN){
                        DtoSellerLogIn dto = (DtoSellerLogIn) request.getObject();
                        Response response = new Response();
                        try{
                            Response r = new Response(serviceSeller.logIn(dto.getUsername(),dto.getPassword(),dto.getIdTruck()), ResponseType.OBJECT);
                            response = r;                           
                        }
                        catch(DoesNotExistException | IncorrectPasswordException e){
                            Response r = new Response(e.getMessage(), ResponseType.ERROR);
                            response = r;
                        }
                        finally{
                            this.out.writeObject(response);
                            this.out.flush();
                            this.out.close();
                            this.s.close();
                        }
                    }
                    if(request.getMethod() == Method.REPORT_SALE){
                        MoSale sale = (MoSale) request.getObject();
                        serviceSeller.reportSale(sale);
                        Response response = new Response(ResponseType.CONFIRMATION);
                        this.out.writeObject(response);
                        this.out.flush();
                        this.out.close();
                        this.s.close();
                    }
                    if(request.getMethod() == Method.LIST_ORDERS){
                        Long idTruck = (Long) request.getObject();
                        Response response = new Response(serviceSeller.listOrders(idTruck), ResponseType.LIST);
                        this.out.writeObject(response);
                        this.out.flush();
                        this.out.close();
                        this.s.close();
                    }
                    if(request.getMethod() == Method.RETURN_ORDER){
                        DtoReturn dto = (DtoReturn) request.getObject();
                        serviceSeller.returnOrder(dto);
                        Response response = new Response(ResponseType.CONFIRMATION);
                        this.out.writeObject(response);
                        this.out.flush();
                        this.out.close();
                        this.s.close();
                    }
                    if(request.getMethod() == Method.LIST_COMBOS){
                        Response response = new Response(serviceSeller.listCombos(), ResponseType.LIST);
                        this.out.writeObject(response);
                        this.out.flush();
                        this.out.close();
                        this.s.close();                      
                    }
                    
            }
        }
        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    
    
    
    
}
