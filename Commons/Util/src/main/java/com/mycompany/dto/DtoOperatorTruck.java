/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;


import com.mycompany.entities.FoodTruck;
import com.mycompany.entities.Operator;
import com.mycompany.model.MoOperator;
import java.io.Serializable;

/**
 *
 * @author carlos
 */
public class DtoOperatorTruck implements Serializable {
    
    private MoOperator operator;
    private FoodTruck foodTruck;

    public DtoOperatorTruck(MoOperator operator, FoodTruck foodTruck) {
        this.operator = operator;
        this.foodTruck = foodTruck;
    }

    public MoOperator getOperator() {
        return operator;
    }

    public void setOperator(MoOperator operator) {
        this.operator = operator;
    }

    public FoodTruck getFoodTruck() {
        return foodTruck;
    }

    public void setFoodTruck(FoodTruck foodTruck) {
        this.foodTruck = foodTruck;
    }
    
}
