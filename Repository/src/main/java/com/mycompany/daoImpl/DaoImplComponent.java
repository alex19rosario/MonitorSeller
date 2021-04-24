/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daoImpl;

import com.mycompany.dao.DaoComponent;
import com.mycompany.entities.Component;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */
public class DaoImplComponent extends DaoComponent{

    @Override
    public List<Component> findAll() {
        List<Component> componentList = new ArrayList<>();
        return componentList;
    }
}
