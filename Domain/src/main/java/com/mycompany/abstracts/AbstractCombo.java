/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abstracts;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author carlos
 */
public abstract class AbstractCombo implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private Double price;
    

    public AbstractCombo(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public AbstractCombo(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
 
    
}
