/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daoImpl;

import com.mycompany.dao.DaoSale;
import com.mycompany.dto.DtoOrder;
import com.mycompany.entities.Sale;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */
public class DaoImplSale extends DaoSale{
    
    private List<Sale> saleDB = new ArrayList<>();
    
    @Override
    public void create(Sale entity) {
        saleDB.add(entity);
    }

    @Override
    public List<DtoOrder> findAllFrom(Long idTruck) {
        List<DtoOrder> orderList = new ArrayList<>();
        for(Sale s: saleDB){
            if(s.getIdTruck() == idTruck){
                orderList.add(new DtoOrder(s.getId(), s.getTotalIncome(), s.getDate()));
            }
        }
        return orderList;
    }

    @Override
    public Sale findById(Long id) {
        Timestamp date = new Timestamp(System.currentTimeMillis());
        Sale sale = new Sale(1L, date, 300.0, 150.0, 1L, 1L);
        return sale;
    }

    @Override
    public void removeById(Long id) {
        saleDB.clear();
        //THIS METHOD COULD BE EMPTY FOR A WHILE, JUST UNTIL SET UP THE PESISTENCE LAYER WITH MYSQL
    }
    
}
