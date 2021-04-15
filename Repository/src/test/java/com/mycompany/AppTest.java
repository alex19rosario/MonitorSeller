package com.mycompany;


import com.mycompany.daoImpl.DaoImplFoodTruck;
import com.mycompany.daoImpl.DaoImplOperator;
import com.mycompany.entities.Operator;
import com.mycompany.exceptions.DoesNotExistException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * @throws com.mycompany.exceptions.DoesNotExistException
     */
    @Test
    public void daoImplOperator_findByUsername() throws DoesNotExistException
    {
        String username = "testOperator";
        DaoImplOperator dao = new DaoImplOperator();
        assertEquals(username, dao.findByUsername(username).getUsername()); 
        
    }
    
    @Test
    public void daoImplOperator_findByUsername_exception(){
        
        DaoImplOperator dao = new DaoImplOperator();
        try {
            Operator op = dao.findByUsername("kk");
            System.out.println("Se ejecuta este bloque");
        } catch (DoesNotExistException ex) {
            assertEquals("The username kk does not exist.", ex.getMessage());
            System.out.println(ex.getMessage());          
        } 
    }
    
    @Test
    public void daoImplOperator_modify(){
        DaoImplOperator dao = new DaoImplOperator();
        Operator op = new Operator(1L, "testOperator", "testOperator", "testPassword", 2L);
        dao.modify(op);
        assertEquals(op.getIdTruck(), dao.findById(1L).getIdTruck());
    }
    
    @Test
    public void daoImplFoodTruck_findById(){
        Long id = 1L;
        DaoImplFoodTruck dao = new DaoImplFoodTruck();
        assertEquals(id, dao.findById(1L).getId());
    }
    
    
    
}
