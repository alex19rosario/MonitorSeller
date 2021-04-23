/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tester;

import com.mycompany.api.Requester;
import com.mycompany.entities.Component;
import com.mycompany.entities.FoodTruck;
import com.mycompany.enums.Method;
import com.mycompany.enums.Service;
import com.mycompany.model.MoCombo;
import com.mycompany.model.MoOperator;
import com.mycompany.model.MoProduct;
import com.mycompany.model.MoSale;
import com.mycompany.supports.Response;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */
public class Client extends Thread{
    
    private Alert alert = Alert.getAlert();
    private Requester requester = new Requester();    
    
    @Override
    public void run(){
        boolean isConsumed = false;
        while (isConsumed == false){
            if (alert.isActive()){
                List<MoCombo> comboList = new ArrayList<>();
                comboList.add(new MoCombo(1L, "testCombo", 100.0, new ArrayList<MoProduct>()));
                List<MoProduct> productList = new ArrayList<>();
                productList.add(new MoProduct(1L, "testProduct", 50.0, 100.0, new ArrayList<Component>()));
                List<Component> componentList = new ArrayList<>();
                componentList.add(new Component(1L, "testComponent", 50.0, 100.0));
                MoOperator op = new MoOperator(1L, "testOperator", "testOperator", "testPassword");
                FoodTruck truck = new FoodTruck(1L, "testAddress");
                Timestamp date = new Timestamp(System.currentTimeMillis());
                Response response = requester.consume(Service.SELLER, Method.REPORT_SALE, new MoSale(1L, date, comboList, productList, componentList, truck, op));       
                isConsumed = true;
            }            
        }
    }
    
}
