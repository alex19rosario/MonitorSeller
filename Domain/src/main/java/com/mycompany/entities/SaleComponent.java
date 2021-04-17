/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

import java.io.Serializable;

/**
 *
 * @author carlos
 */
public class SaleComponent implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long idSale;
    private Long idComponent;

    public SaleComponent(Long id, Long idSale, Long idComponent) {
        this.id = id;
        this.idSale = idSale;
        this.idComponent = idComponent;
    }
    
    public SaleComponent(Long idSale, Long idComponent) {
        this.idSale = idSale;
        this.idComponent = idComponent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdSale() {
        return idSale;
    }

    public void setIdSale(Long idSale) {
        this.idSale = idSale;
    }

    public Long getIdComponent() {
        return idComponent;
    }

    public void setIdComponent(Long idComponent) {
        this.idComponent = idComponent;
    }
    
}
