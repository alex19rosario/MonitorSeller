/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

import com.mycompany.abstracts.AbstractCombo;
import java.io.Serializable;

/**
 *
 * @author carlos
 */
public class Combo extends AbstractCombo implements Serializable{
    
    public Combo(Long id, String name, Double price) {
        super(id, name, price);
    }
    
    public Combo(String name, Double price) {
        super(name, price);
    }
    
}
