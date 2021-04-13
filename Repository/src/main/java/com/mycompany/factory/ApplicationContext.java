/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factory;

import com.mycompany.dao.GenericDao;
import com.mycompany.daoImpl.DaoImplFoodTruck;
import com.mycompany.daoImpl.DaoImplOperator;

/**
 *
 * @author carlos
 */
public class ApplicationContext {
    
    public static GenericDao getDao(DaoEnum dao){
        switch(dao){
            case DAO_OPERATOR:
                return new DaoImplOperator();
            case DAO_FOODTRUCK:
                return new DaoImplFoodTruck();
            default:
                return null;
        }
    }
    
}
