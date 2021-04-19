/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author carlos
 */
public class DtoReturn implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private Long idSale;
    private Timestamp date;

    public DtoReturn(Long idSale, Timestamp date) {
        this.idSale = idSale;
        this.date = date;
    }

    public Long getIdSale() {
        return idSale;
    }

    public void setIdSale(Long idSale) {
        this.idSale = idSale;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
    
}
