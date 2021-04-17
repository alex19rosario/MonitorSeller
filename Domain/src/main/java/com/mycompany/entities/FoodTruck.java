/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

import java.io.Serializable;

/**
 *
 * @author carlos
 */
public class FoodTruck implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private Long id;
    private String address;

    public FoodTruck(String address) {
        this.address = address;
    }

    public FoodTruck(Long id, String address) {
        this.id = id;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
