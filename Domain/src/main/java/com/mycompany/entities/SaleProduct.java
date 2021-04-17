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
public class SaleProduct implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long idSale;
    private Long idProduct;

    public SaleProduct(Long id, Long idSale, Long idProduct) {
        this.id = id;
        this.idSale = idSale;
        this.idProduct = idProduct;
    }
    
    public SaleProduct(Long idSale, Long idProduct) {
        this.idSale = idSale;
        this.idProduct = idProduct;
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

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }
    
}
