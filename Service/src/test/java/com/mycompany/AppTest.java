package com.mycompany;


import com.mycompany.dto.DtoOperatorTruck;
import com.mycompany.entities.FoodTruck;
import com.mycompany.entities.Operator;
import com.mycompany.exceptions.DoesNotExistException;
import com.mycompany.exceptions.IncorrectPasswordException;
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
    public void logIn() throws DoesNotExistException, IncorrectPasswordException
    {
        DtoOperatorTruck dto = new DtoOperatorTruck(new Operator("testOperator", "testOperator", "testPassword"), new FoodTruck(1L, "testAddress"));
        ServiceImplSeller service = new ServiceImplSeller();
        DtoOperatorTruck dtoToCompare = service.logIn("testOperator", "testPassword", 1L);
        assertEquals(dto.getOperator().getName(),dtoToCompare.getOperator().getName());
    }
}
