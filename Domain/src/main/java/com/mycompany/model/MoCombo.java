/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import com.mycompany.abstracts.AbstractCombo;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author carlos
 */
public class MoCombo extends AbstractCombo implements Serializable {
    
    private List<MoProduct> productList;

    public MoCombo(Long id, String name, Double price, List<MoProduct> productList) {
        super(id, name, price);
        this.productList = productList;
    }
    
    public MoCombo(String name, Double price, List<MoProduct> productList) {
        super(name, price);
        this.productList = productList;
    }

    public List<MoProduct> getProductList() {
        return productList;
    }

    public void setProductList(List<MoProduct> productList) {
        this.productList = productList;
    }
    
    
    
}
