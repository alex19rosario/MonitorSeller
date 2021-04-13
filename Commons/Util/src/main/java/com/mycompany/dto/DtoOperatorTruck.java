/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;


import com.mycompany.entities.FoodTruck;
import com.mycompany.entities.Operator;
import java.io.Serializable;

/**
 *
 * @author carlos
 */
public class DtoOperatorTruck implements Serializable {
    
    private Operator operator;
    private FoodTruck foodTruck;

    public DtoOperatorTruck(Operator operator, FoodTruck foodTruck) {
        this.operator = operator;
        this.foodTruck = foodTruck;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public FoodTruck getFoodTruck() {
        return foodTruck;
    }

    public void setFoodTruck(FoodTruck foodTruck) {
        this.foodTruck = foodTruck;
    }
    
}
