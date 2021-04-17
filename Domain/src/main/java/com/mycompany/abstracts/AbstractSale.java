/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abstracts;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author carlos
 */
public abstract class AbstractSale implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private Long id;
    private Timestamp date;

    public AbstractSale(Long id, Timestamp date) {
        this.id = id;
        this.date = date;
    }
    
    public AbstractSale(Timestamp date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
     
}
