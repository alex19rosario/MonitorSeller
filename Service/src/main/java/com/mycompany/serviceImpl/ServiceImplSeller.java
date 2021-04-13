/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.serviceImpl;

import com.mycompany.dao.DaoFoodTruck;
import com.mycompany.dao.DaoOperator;
import com.mycompany.dto.DtoOperatorTruck;
import com.mycompany.entities.FoodTruck;
import com.mycompany.entities.Operator;
import com.mycompany.exceptions.DoesNotExistException;
import com.mycompany.exceptions.IncorrectPasswordException;
import com.mycompany.factory.ApplicationContext;
import com.mycompany.factory.DaoEnum;
import com.mycompany.service.ServiceSeller;

/**
 *
 * @author carlos
 */
public class ServiceImplSeller implements ServiceSeller {
    
 
    private final DaoOperator daoOperator = (DaoOperator) ApplicationContext.getDao(DaoEnum.DAO_OPERATOR);
    private final DaoFoodTruck daoTruck = (DaoFoodTruck) ApplicationContext.getDao(DaoEnum.DAO_FOODTRUCK);

    @Override
    public DtoOperatorTruck logIn(String username, String password, Long idTruck) throws DoesNotExistException, IncorrectPasswordException {
         
        Operator operator = daoOperator.findByUsername(username);
        if(!operator.getPassword().equalsIgnoreCase(password)){
            throw new IncorrectPasswordException("The password is incorrect.");
        }    
        FoodTruck truck = daoTruck.findById(idTruck);
        return new DtoOperatorTruck(operator,truck);
            
    }
}
