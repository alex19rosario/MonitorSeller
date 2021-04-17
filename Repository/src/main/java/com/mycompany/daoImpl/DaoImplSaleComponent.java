/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daoImpl;

import com.mycompany.dao.DaoSaleComponent;
import com.mycompany.entities.SaleComponent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */
public class DaoImplSaleComponent extends DaoSaleComponent{
    
    private List<SaleComponent> saleComponentDB = new ArrayList<>();
    
    @Override
    public void create(SaleComponent entity) {
        saleComponentDB.add(entity);
    }
    
}
