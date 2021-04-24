/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exceptions;

/**
 *
 * @author carlos
 */
public class TruckNotAvailableException extends Exception {

    public TruckNotAvailableException() {
    }

    public TruckNotAvailableException(String message) {
        super(message);
    }

    public TruckNotAvailableException(String message, Throwable cause) {
        super(message, cause);
    }

    public TruckNotAvailableException(Throwable cause) {
        super(cause);
    }
    
}
