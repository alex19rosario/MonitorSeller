/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.dto.DtoOrder;
import com.mycompany.dto.DtoReturn;
import com.mycompany.entities.Component;
import com.mycompany.exceptions.DoesNotExistException;
import com.mycompany.exceptions.IncorrectPasswordException;
import com.mycompany.model.MoCombo;
import com.mycompany.model.MoOperator;
import com.mycompany.model.MoProduct;
import com.mycompany.model.MoSale;
import java.util.List;

/**
 *
 * @author carlos
 */
public interface ServiceSeller {
    
    public MoOperator logIn(String username, String password, Long idTruck) throws DoesNotExistException, IncorrectPasswordException;
    
    public void reportSale(MoSale sale);
    
    public List<DtoOrder> listOrders(Long idTruck);
    
    public void returnOrder(DtoReturn dto);
    
    public List<MoCombo> listCombos();
    
    public List<MoProduct> listProducts();
    
    public List<Component> listComponents();
    
}
