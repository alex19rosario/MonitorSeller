/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abstracts;

import java.io.Serializable;

/**
 *
 * @author carlos
 */
public abstract class AbstractProduct implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private Double cost;
    private Double price;

    public AbstractProduct(Long id, String name, Double cost, Double price) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.price = price;
    }
    
    public AbstractProduct(String name, Double cost, Double price) {
        this.name = name;
        this.cost = cost;
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

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    
    
    
    
}
