/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daoImpl;

import com.mycompany.dao.DaoFoodTruck;
import com.mycompany.entities.FoodTruck;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */
public class DaoImplFoodTruck extends DaoFoodTruck{
    
    List<FoodTruck> foodTruckDB = new ArrayList<>();
    FoodTruck truck;
    
    public DaoImplFoodTruck(){
        this.truck = new FoodTruck(1L,"testAddress");
        foodTruckDB.add(truck);
    }

    @Override
    public FoodTruck findById(Long id) {
        return foodTruckDB.get(0);
    }

    @Override
    public boolean isNotAvailable(Long id) {
        if(id == 1L){
            return false;
        }
        else{
            return true;
        }
    }
    
}
