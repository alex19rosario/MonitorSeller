/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import com.mycompany.abstracts.AbstractSale;
import com.mycompany.entities.Component;
import com.mycompany.entities.FoodTruck;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author carlos
 */
public class MoSale extends AbstractSale implements Serializable {
    
    private List<MoCombo> comboList;
    private List<MoProduct> productList;   
    private List<Component> componentList;
    private FoodTruck truck;
    private MoOperator operator;
    
    public MoSale(Long id, Timestamp date, List<MoCombo> comboList, List<MoProduct> productList, List<Component> componentList, FoodTruck truck, MoOperator operator) {
        super(id, date);
        this.comboList = comboList;
        this.productList = productList;
        this.componentList = componentList;
        this.truck = truck;
        this.operator = operator;
    }
    
    public MoSale(Timestamp date, List<MoCombo> comboList, List<MoProduct> productList, List<Component> componentList, FoodTruck truck, MoOperator operator) {
        super(date);
        this.comboList = comboList;
        this.productList = productList;
        this.componentList = componentList;
        this.truck = truck;
        this.operator = operator;
    }
    
    public MoSale(Timestamp date, List<MoCombo> comboList, FoodTruck truck, MoOperator operator){
        super(date);
        this.comboList = comboList;
        this.truck = truck;
        this.operator = operator;      
    }

    public List<MoCombo> getComboList() {
        return comboList;
    }

    public void setComboList(List<MoCombo> comboList) {
        this.comboList = comboList;
    }

    public List<MoProduct> getProductList() {
        return productList;
    }

    public void setProductList(List<MoProduct> productList) {
        this.productList = productList;
    }

    public List<Component> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<Component> componentList) {
        this.componentList = componentList;
    }

    public FoodTruck getTruck() {
        return truck;
    }

    public void setTruck(FoodTruck truck) {
        this.truck = truck;
    }

    public MoOperator getOperator() {
        return operator;
    }

    public void setOperator(MoOperator operator) {
        this.operator = operator;
    }
  
}
