/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.model.MoProduct;
import java.util.List;

/**
 *
 * @author carlos
 */
public abstract class DaoProduct implements GenericDao {
    
    public abstract List<MoProduct> findAllProducts();
    
}
