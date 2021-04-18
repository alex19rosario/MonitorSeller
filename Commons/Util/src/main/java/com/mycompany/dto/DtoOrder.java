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
public class DtoOrder implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private Long idSale;
    private Double income;
    private Timestamp time;

    public DtoOrder(Long idSale, Double income, Timestamp time) {
        this.idSale = idSale;
        this.income = income;
        this.time = time;
    }

    public Long getIdSale() {
        return idSale;
    }

    public void setIdSale(Long idSale) {
        this.idSale = idSale;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    } 
    
}
