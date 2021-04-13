package com.mycompany;

import com.mycompany.api.Requester;
import com.mycompany.dto.DtoOperatorTruck;
import com.mycompany.dto.DtoSellerLogIn;
import com.mycompany.entities.Operator;
import com.mycompany.enums.Method;
import com.mycompany.enums.Service;
import com.mycompany.supports.Response;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    private final Requester requester = new Requester();
    
    @Test
    public void logIn_HappyPath(){
           
        Operator testOperator = new Operator("testOperator", "testOperator", "testPassword");
        testOperator.setId(1L);
        Response response = (Response) requester.get(Service.SELLER, Method.LOG_IN, new DtoSellerLogIn("testOperator", "testPassword",1L));
        DtoOperatorTruck dto = (DtoOperatorTruck) response.getObject();
        assertEquals(dto.getOperator().getPassword(),testOperator.getPassword());
        
    }
    
    @Test
    public void logIn_UserNotExist(){
        
        Response response = (Response) requester.get(Service.SELLER, Method.LOG_IN, new DtoSellerLogIn("testOperator1", "testPassword",1L));
        String exceptionMessage = response.getExceptionMessage();
        assertEquals("The username testOperator1 does not exist.",exceptionMessage);
        
    }
    
    @Test
    public void logIn_IncorrectPassword(){
        
        Response response = (Response) requester.get(Service.SELLER, Method.LOG_IN, new DtoSellerLogIn("testOperator", "testPassword1",1L));
        String exceptionMessage = response.getExceptionMessage();
        assertEquals("The password is incorrect.",exceptionMessage);
        
    }
}
