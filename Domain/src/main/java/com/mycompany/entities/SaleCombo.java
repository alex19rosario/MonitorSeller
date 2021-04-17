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
public class SaleCombo implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long idSale;
    private Long idCombo;

    public SaleCombo(Long id, Long idSale, Long idCombo) {
        this.id = id;
        this.idSale = idSale;
        this.idCombo = idCombo;
    }
    
    public SaleCombo( Long idSale, Long idCombo) {
        
        this.idSale = idSale;
        this.idCombo = idCombo;
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

    public Long getIdCombo() {
        return idCombo;
    }

    public void setIdCombo(Long idCombo) {
        this.idCombo = idCombo;
    }
    
}
