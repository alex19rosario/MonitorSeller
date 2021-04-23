/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tester;

import java.sql.Timestamp;

/**
 *
 * @author carlos
 */
public class Tester {
    
    private Alert alert = Alert.getAlert();
    
    public void test(int nClients){
        for(int x = 0; x < nClients; x++){
            Client client = new Client();
            client.start();
        }
        alert.setActive(true);
    }
    
    public static void main(String args[]){
        
        Tester tester = new Tester();
        
        System.out.println(new Timestamp(System.currentTimeMillis()));
        for(int x = 1; x <= 100; x++){
            try{
                tester.test(x);
                System.out.println(x+" clients consumed the service succesfully");
            }
            catch(Exception e){
                System.out.println((x-1)+" clients is the limit");
            }
        }
        System.out.println(new Timestamp(System.currentTimeMillis()));
        
    }
    
    
}
