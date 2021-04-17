/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abstracts;

import java.io.Serializable;

/**
 *
 * @author carlos
 */
public abstract class AbstractOperator implements Serializable{
    
    private static final long serialVersionUID = 3195018210144640487L;
    private Long id;
    private String name;
    private String username;
    private String password;

    public AbstractOperator(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }
    
    public AbstractOperator(Long id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
}
