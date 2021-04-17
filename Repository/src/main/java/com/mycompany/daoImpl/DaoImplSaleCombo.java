/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daoImpl;

import com.mycompany.dao.DaoSaleCombo;
import com.mycompany.entities.SaleCombo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */
public class DaoImplSaleCombo extends DaoSaleCombo {
    
    private List<SaleCombo> saleComboDB = new ArrayList<>();

    @Override
    public void create(SaleCombo entity) {
        saleComboDB.add(entity);
    }
    
}
