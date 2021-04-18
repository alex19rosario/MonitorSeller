/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author carlos
 */
public class Return implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private Long id;
    private Double refund;
    private Long idTruck;
    private Long idOperator;
    private Timestamp date;

    public Return(Long id, Double refund, Long idTruck, Long idOperator, Timestamp date) {
        this.id = id;
        this.refund = refund;
        this.idTruck = idTruck;
        this.idOperator = idOperator;
        this.date = date;
    }

    public Return(Double refund, Long idTruck, Long idOperator, Timestamp date) {
        this.refund = refund;
        this.idTruck = idTruck;
        this.idOperator = idOperator;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getRefund() {
        return refund;
    }

    public void setRefund(Double refund) {
        this.refund = refund;
    }

    public Long getIdTruck() {
        return idTruck;
    }

    public void setIdTruck(Long idTruck) {
        this.idTruck = idTruck;
    }

    public Long getIdOperator() {
        return idOperator;
    }

    public void setIdOperator(Long idOperator) {
        this.idOperator = idOperator;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
    
}
