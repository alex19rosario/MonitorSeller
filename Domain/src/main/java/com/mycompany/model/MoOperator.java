/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import com.mycompany.abstracts.AbstractOperator;
import com.mycompany.entities.FoodTruck;
import java.io.Serializable;

/**
 *
 * @author carlos
 */
public class MoOperator extends AbstractOperator implements Serializable{
    
    private FoodTruck truck;
    
    public MoOperator(String name, String username, String password) {
        super(name, username, password);
    }
    
    public MoOperator(Long id, String name, String username, String password) {
        super(id, name, username, password);
    }
    
    public MoOperator(Long id, String name, String username, String password, FoodTruck truck){
        super(id, name, username, password);
        this.truck = truck;
    }

    public FoodTruck getTruck() {
        return truck;
    }

    public void setTruck(FoodTruck truck) {
        this.truck = truck;
    }
}
