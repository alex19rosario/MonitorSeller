/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.dto.DtoOrder;
import com.mycompany.dto.DtoReturn;
import com.mycompany.dto.DtoSellerLogIn;
import com.mycompany.entities.Component;
import com.mycompany.exceptions.DoesNotExistException;
import com.mycompany.exceptions.IncorrectPasswordException;
import com.mycompany.exceptions.TruckNotAvailableException;
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
    
    public MoOperator logIn(DtoSellerLogIn dto) throws DoesNotExistException, IncorrectPasswordException, TruckNotAvailableException;
    
    public void reportSale(MoSale sale);
    
    public List<DtoOrder> listOrders(Long idTruck);
    
    public void returnOrder(DtoReturn dto);
    
    public List<MoCombo> listCombos();
    
    public List<MoProduct> listProducts();
    
    public List<Component> listComponents();
    
    public void logOut(MoOperator operator);
    
}
