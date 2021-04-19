/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daoImpl;

import com.mycompany.dao.DaoReturn;
import com.mycompany.entities.Return;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */
public class DaoImplReturn extends DaoReturn{
    
    private List<Return> returnDB = new ArrayList<>();
    
    @Override
    public void create(Return entity) {
        returnDB.add(entity);
    }
    
}
