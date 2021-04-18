/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.supports;

import com.mycompany.enums.Method;
import com.mycompany.enums.Service;
import java.io.Serializable;

/**
 *
 * @author carlos
 */
public class Request<O> implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private Service service;
    private Method method;
    private O object;

    public Request(Service service, Method method, O object) {
        this.service = service;
        this.method = method;
        this.object = object;
    }

    public Request(Service service, Method method) {
        this.service = service;
        this.method = method;
    }

    public Service getService() {
        return service;
    }

    public Method getMethod() {
        return method;
    }

    public O getObject() {
        return object;
    }
        
        
    
}
