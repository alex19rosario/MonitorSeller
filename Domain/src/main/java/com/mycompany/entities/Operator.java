/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;


import com.mycompany.abstracts.AbstractOperator;
import java.io.Serializable;

/**
 *
 * @author carlos
 */
public class Operator extends AbstractOperator implements Serializable{
    
    private Long idTruck;
    
    public Operator(String name, String username, String password) {
        super(name, username, password);
    }
    
    public Operator(Long id, String name, String username, String password) {
        super(id, name, username, password);
    }
    
    public Operator(Long id, String name, String username, String password, Long idTruck) {
        super(id, name, username, password);
        this.idTruck = idTruck;
    }

    public Long getIdTruck() {
        return idTruck;
    }

    public void setIdTruck(Long idTruck) {
        this.idTruck = idTruck;
    }

}
