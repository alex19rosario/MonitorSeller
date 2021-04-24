/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entities.FoodTruck;

/**
 *
 * @author carlos
 */
public abstract class DaoFoodTruck implements GenericFinder<FoodTruck, Long>{
    
    public abstract boolean isNotAvailable(Long id);
}
