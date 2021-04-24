/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factory;

import com.mycompany.dao.GenericDao;
import com.mycompany.daoImpl.DaoImplCombo;
import com.mycompany.daoImpl.DaoImplFoodTruck;
import com.mycompany.daoImpl.DaoImplOperator;
import com.mycompany.daoImpl.DaoImplProduct;
import com.mycompany.daoImpl.DaoImplReturn;
import com.mycompany.daoImpl.DaoImplSale;
import com.mycompany.daoImpl.DaoImplSaleCombo;
import com.mycompany.daoImpl.DaoImplSaleComponent;
import com.mycompany.daoImpl.DaoImplSaleProduct;

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
            case DAO_SALE:
                return new DaoImplSale();
            case DAO_SALE_COMBO:
                return new DaoImplSaleCombo();
            case DAO_SALE_PRODUCT:
                return new DaoImplSaleProduct();
            case DAO_SALE_COMPONENT:
                return new DaoImplSaleComponent();
            case DAO_RETURN:
                return new DaoImplReturn();
            case DAO_COMBO:
                return new DaoImplCombo();
            case DAO_PRODUCT:
                return new DaoImplProduct();
            default:
                return null;
        }
    }
    
}
