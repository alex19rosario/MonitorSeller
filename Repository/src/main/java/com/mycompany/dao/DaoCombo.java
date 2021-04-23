/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entities.Combo;
import com.mycompany.model.MoCombo;
import java.util.List;

/**
 *
 * @author carlos
 */
public abstract class DaoCombo implements GenericDao {
    
    public abstract List<MoCombo> findAllCombos();
}
