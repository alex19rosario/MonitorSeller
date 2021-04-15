/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.exceptions.DoesNotExistException;
import com.mycompany.exceptions.IncorrectPasswordException;
import com.mycompany.model.MoOperator;

/**
 *
 * @author carlos
 */
public interface ServiceSeller {
    
    public MoOperator logIn(String username, String password, Long idTruck) throws DoesNotExistException, IncorrectPasswordException;
    
}
