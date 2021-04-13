 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daoImpl;

import com.mycompany.dao.DaoOperator;
import com.mycompany.entities.Operator;
import com.mycompany.exceptions.DoesNotExistException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */
public class DaoImplOperator extends DaoOperator {
    
    List<Operator> operatorDB = new ArrayList<>();
    Operator operator;
    
    
    public DaoImplOperator(){
        this.operator = new Operator(1L, "testOperator", "testOperator","testPassword");
        this.operatorDB.add(operator);     
    }
    
    @Override
    public Operator findByUsername(String username) throws DoesNotExistException {
        
        if(operator.getUsername().equalsIgnoreCase(username)){
            return operator;
        }
        else{
            throw new DoesNotExistException("The username "+username+" does not exist.");
        }
    }

    @Override
    public Operator findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
