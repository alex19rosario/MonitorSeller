/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daoImpl;

import com.mycompany.dao.DaoSaleProduct;
import com.mycompany.entities.SaleProduct;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */
public class DaoImplSaleProduct extends DaoSaleProduct{
    
    private List<SaleProduct> saleProductDB = new ArrayList<>();

    @Override
    public void create(SaleProduct entity) {
        saleProductDB.add(entity);
    }
    
}
