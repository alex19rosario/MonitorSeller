/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tester;

/**
 *
 * @author carlos
 */
public class Alert {
    
    private boolean active = false;
    private static Alert alert;
    
    private Alert(){}
    
    public static Alert getAlert(){
        if(alert == null){
            alert = new Alert();
        }
        return alert;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    
    
    
}
