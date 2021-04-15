/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.serviceImpl;

import com.mycompany.dao.DaoFoodTruck;
import com.mycompany.dao.DaoOperator;
import com.mycompany.entities.Operator;
import com.mycompany.exceptions.DoesNotExistException;
import com.mycompany.exceptions.IncorrectPasswordException;
import com.mycompany.factory.ApplicationContext;
import com.mycompany.factory.DaoEnum;
import com.mycompany.model.MoOperator;
import com.mycompany.service.ServiceSeller;

/**
 *
 * @author carlos
 */
public class ServiceImplSeller implements ServiceSeller {
    
 
    private final DaoOperator daoOperator = (DaoOperator) ApplicationContext.getDao(DaoEnum.DAO_OPERATOR);
    private final DaoFoodTruck daoTruck = (DaoFoodTruck) ApplicationContext.getDao(DaoEnum.DAO_FOODTRUCK);

    @Override
    public MoOperator logIn(String username, String password, Long idTruck) throws DoesNotExistException, IncorrectPasswordException {
         
        Operator op = daoOperator.findByUsername(username);
        if(!op.getPassword().equalsIgnoreCase(password)){
            throw new IncorrectPasswordException("The password is incorrect.");
        }
        return new MoOperator(op.getId(), op.getName(), op.getUsername(), op.getPassword(), daoTruck.findById(idTruck));       
    }
}
