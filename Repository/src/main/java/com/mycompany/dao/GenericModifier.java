/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

/**
 *
 * @author carlos
 */
public interface GenericModifier<T> extends GenericDao{
    
    public void modify(T entity);
    
}