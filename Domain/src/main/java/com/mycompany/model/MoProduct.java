/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import com.mycompany.abstracts.AbstractProduct;
import com.mycompany.entities.Component;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author carlos
 */
public class MoProduct extends AbstractProduct implements Serializable{
    
    private List<Component> componentList;
    
    public MoProduct(Long id, String name, Double cost, Double price, List<Component> componentList) {
        super(id, name, cost, price);
        this.componentList = componentList;
    }

    public List<Component> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<Component> componentList) {
        this.componentList = componentList;
    }


}
