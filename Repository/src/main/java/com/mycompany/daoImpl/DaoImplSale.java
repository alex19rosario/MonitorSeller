/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daoImpl;

import com.mycompany.dao.DaoSale;
import com.mycompany.entities.Sale;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */
public class DaoImplSale extends DaoSale{
    
    private List<Sale> saleDB = new ArrayList<>();
    
    @Override
    public void create(Sale entity) {
        saleDB.add(entity);
    }
    
}
