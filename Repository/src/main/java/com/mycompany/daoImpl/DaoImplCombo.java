/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daoImpl;

import com.mycompany.dao.DaoCombo;
import com.mycompany.model.MoCombo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */
public class DaoImplCombo extends DaoCombo {
    
    
    @Override
    public List<MoCombo> findAllCombos() {      
        List<MoCombo> comboList = new ArrayList<>();
        return comboList;
    }
    
   
    
}
