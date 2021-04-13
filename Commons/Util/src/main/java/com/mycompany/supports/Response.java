/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.supports;

import com.mycompany.enums.ResponseType;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author carlos
 */
public class Response<O> implements Serializable {
    private static final long serialVersionUID = 1L;
    private O object;
    private List<O> objectList;
    private ResponseType type;
    private String exceptionMessage;
    
    public Response(){
        
    }

    public Response(O object, ResponseType type) {
        this.object = object;
        this.type = type;
    }

    public Response(List<O> objectList, ResponseType type) {
        this.objectList = objectList;
        this.type = type;
    }
    
    public Response(String exceptionMessage, ResponseType type){
        this.exceptionMessage = exceptionMessage;
        this.type = type;
    }
    
    public Response(ResponseType type){
        this.type = type;
    }

    public O getObject() {
        return object;
    }

    public List<O> getObjectList() {
        return objectList;
    }

    public ResponseType getType() {
        return type;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

}
