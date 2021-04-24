/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import java.util.List;

/**
 *
 * @author carlos
 */
public interface GenericFindAll<T> extends GenericDao {
    
    public List<T> findAll();
}
