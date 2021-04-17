/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

import com.mycompany.abstracts.AbstractProduct;
import java.io.Serializable;

/**
 *
 * @author carlos
 */
public class Product extends AbstractProduct implements Serializable{
    
    public Product(Long id, String name, Double cost, Double price) {
        super(id, name, cost, price);
    }
    
    public Product(String name, Double cost, Double price) {
        super(name, cost, price);
    }
    
}
