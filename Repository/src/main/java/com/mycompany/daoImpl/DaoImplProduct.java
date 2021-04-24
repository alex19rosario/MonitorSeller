/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daoImpl;

import com.mycompany.dao.DaoProduct;
import com.mycompany.model.MoProduct;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */
public class DaoImplProduct extends DaoProduct{

    @Override
    public List<MoProduct> findAllProducts() {
        List<MoProduct> productList = new ArrayList<>();
        return productList;
    }
    
}
