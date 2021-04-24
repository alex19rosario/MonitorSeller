package com.mycompany;

import com.mycompany.dto.DtoSellerLogIn;
import com.mycompany.exceptions.DoesNotExistException;
import com.mycompany.exceptions.IncorrectPasswordException;
import com.mycompany.exceptions.TruckNotAvailableException;
import com.mycompany.model.MoOperator;
import com.mycompany.serviceImpl.ServiceImplSeller;
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
    @Test
    public void logIn() throws DoesNotExistException, IncorrectPasswordException, TruckNotAvailableException
    {
        MoOperator op = new MoOperator("testOperator", "testOperator", "testPassword");
        ServiceImplSeller service = new ServiceImplSeller();
        MoOperator opToCompare = service.logIn(new DtoSellerLogIn("testOperator", "testPassword", 1L));
        assertEquals(op.getPassword(),opToCompare.getPassword());
    }
    
}
