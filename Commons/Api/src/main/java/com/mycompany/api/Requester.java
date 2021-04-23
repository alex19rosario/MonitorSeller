/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.api;

import com.mycompany.enums.Method;
import com.mycompany.enums.Service;
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
public class Requester<O> {
    
    private Response response;
    private final String ip = "10.0.0.6";
    
    public Response consume(Service service, Method method, O object){
        
        try{
            Socket s = new Socket(ip, 4444); 
            ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(s.getInputStream());
            Request request = new Request(service, method, object);
            out.writeObject(request);
            this.response = (Response) in.readObject();
            in.close();
            out.flush();
            out.close();
            s.close();
        }
        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        finally{
            return this.response;
        }
    }
    
    public Response consume(Service service, Method method){
        
        try{
            Socket s = new Socket(ip, 4444); 
            ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(s.getInputStream());
            Request request = new Request(service, method);
            out.writeObject(request);
            this.response = (Response) in.readObject();
            in.close();
            out.flush();
            out.close();
            s.close();
        }
        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        finally{
            return this.response;
        }
    }
    
}
