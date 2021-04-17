/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

import com.mycompany.abstracts.AbstractSale;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author carlos
 */
public class Sale extends AbstractSale implements Serializable{ 
    
    private Double totalIncome;
    private Double totalProfit;
    private Long idTruck;
    private Long idOperator;
    
    public Sale(Long id, Timestamp date, Double totalIncome, Double totalProfit, Long idTruck, Long idOperator) {
        super(id, date);
        this.totalIncome = totalIncome;
        this.totalProfit = totalProfit;
        this.idTruck = idTruck;
        this.idOperator = idOperator;
    }
    
    public Sale(Timestamp date, Double totalIncome, Double totalProfit, Long idTruck, Long idOperator) {
        super(date);
        this.totalIncome = totalIncome;
        this.totalProfit = totalProfit;
        this.idTruck = idTruck;
        this.idOperator = idOperator;
    }

    public Double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(Double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public Double getTotalUtility() {
        return totalProfit;
    }

    public void setTotalUtility(Double totalProfit) {
        this.totalProfit = totalProfit;
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
    
}
