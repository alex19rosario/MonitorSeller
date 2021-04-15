/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entities.Operator;
import com.mycompany.exceptions.DoesNotExistException;

/**
 *
 * @author carlos
 */
public abstract class DaoOperator implements GenericFinder<Operator,Long>, GenericModifier<Operator> {
    
    public abstract Operator findByUsername(String username) throws DoesNotExistException;
}
