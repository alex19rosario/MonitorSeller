package com.mycompany;

import com.mycompany.api.Requester;
import com.mycompany.dto.DtoOrder;
import com.mycompany.dto.DtoReturn;
import com.mycompany.dto.DtoSellerLogIn;
import com.mycompany.entities.Component;
import com.mycompany.entities.FoodTruck;
import com.mycompany.enums.Method;
import com.mycompany.enums.ResponseType;
import com.mycompany.enums.Service;
import com.mycompany.model.MoCombo;
import com.mycompany.model.MoOperator;
import com.mycompany.model.MoProduct;
import com.mycompany.model.MoSale;
import com.mycompany.supports.Response;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
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
        Response response = (Response) requester.consume(Service.SELLER, Method.LOG_IN, new DtoSellerLogIn("testOperator", "testPassword",1L));
        MoOperator op = (MoOperator) response.getObject();
        assertEquals("testPassword",op.getPassword());       
    }
    
    @Test
    public void logIn_UserNotExist(){       
        Response response = (Response) requester.consume(Service.SELLER, Method.LOG_IN, new DtoSellerLogIn("testOperator1", "testPassword",1L));
        String exceptionMessage = response.getExceptionMessage();
        assertEquals("The username testOperator1 does not exist.",exceptionMessage);        
    }
    
    @Test
    public void logIn_IncorrectPassword(){       
        Response response = (Response) requester.consume(Service.SELLER, Method.LOG_IN, new DtoSellerLogIn("testOperator", "testPassword1",1L));
        String exceptionMessage = response.getExceptionMessage();
        assertEquals("The password is incorrect.",exceptionMessage);       
    }
    
    @Test
    public void reportSale(){          
        List<MoCombo> comboList = new ArrayList<>();
        comboList.add(new MoCombo(1L, "testCombo", 100.0, new ArrayList<MoProduct>()));
        List<MoProduct> productList = new ArrayList<>();
        productList.add(new MoProduct(1L, "testProduct", 50.0, 100.0, new ArrayList<Component>()));
        List<Component> componentList = new ArrayList<>();
        componentList.add(new Component(1L, "testComponent", 50.0, 100.0));
        MoOperator op = new MoOperator(1L, "testOperator", "testOperator", "testPassword");
        FoodTruck truck = new FoodTruck(1L, "testAddress");
        Timestamp date = new Timestamp(System.currentTimeMillis());
        Response response = requester.consume(Service.SELLER, Method.REPORT_SALE, new MoSale(1L, date, comboList, productList, componentList, truck, op));
        assertEquals(ResponseType.CONFIRMATION,response.getType());  
    }
    
    @Test
    public void ListOrders(){
        Response response = requester.consume(Service.SELLER, Method.LIST_ORDERS, 1L);
        assertEquals(ResponseType.LIST, response.getType());
    }
    
    @Test
    public void returnOrder(){
        Timestamp date = new Timestamp(System.currentTimeMillis());
        Response response = requester.consume(Service.SELLER, Method.RETURN_ORDER, new DtoReturn(1L, date));
        assertEquals(ResponseType.CONFIRMATION, response.getType());
    }
    
    @Test
    public void listCombos(){
        Response response = requester.consume(Service.SELLER, Method.LIST_COMBOS);
        assertEquals(ResponseType.LIST, response.getType());
    }
}
