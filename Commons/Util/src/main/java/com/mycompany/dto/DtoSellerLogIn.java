/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;

import java.io.Serializable;

/**
 *
 * @author carlos
 */
public class DtoSellerLogIn implements Serializable {
    
    private String username;
    private String password;
    private Long idTruck;

    public DtoSellerLogIn(String username, String password, Long idTruck) {
        this.username = username;
        this.password = password;
        this.idTruck = idTruck;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getIdTruck() {
        return idTruck;
    }

    public void setIdTruck(Long idTruck) {
        this.idTruck = idTruck;
    }
    
    
}
