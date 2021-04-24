/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.serviceImpl;

import com.mycompany.dao.DaoCombo;
import com.mycompany.dao.DaoComponent;
import com.mycompany.dao.DaoFoodTruck;
import com.mycompany.dao.DaoOperator;
import com.mycompany.dao.DaoProduct;
import com.mycompany.dao.DaoReturn;
import com.mycompany.dao.DaoSale;
import com.mycompany.dao.DaoSaleCombo;
import com.mycompany.dao.DaoSaleComponent;
import com.mycompany.dao.DaoSaleProduct;
import com.mycompany.dto.DtoOrder;
import com.mycompany.dto.DtoReturn;
import com.mycompany.dto.DtoSellerLogIn;
import com.mycompany.entities.Component;
import com.mycompany.entities.Operator;
import com.mycompany.entities.Return;
import com.mycompany.entities.Sale;
import com.mycompany.entities.SaleCombo;
import com.mycompany.entities.SaleComponent;
import com.mycompany.entities.SaleProduct;
import com.mycompany.exceptions.DoesNotExistException;
import com.mycompany.exceptions.IncorrectPasswordException;
import com.mycompany.exceptions.TruckNotAvailableException;
import com.mycompany.factory.ApplicationContext;
import com.mycompany.factory.DaoEnum;
import com.mycompany.model.MoCombo;
import com.mycompany.model.MoOperator;
import com.mycompany.model.MoProduct;
import com.mycompany.model.MoSale;
import com.mycompany.service.ServiceSeller;
import com.mycompany.supports.Calculator;
import java.util.List;

/**
 *
 * @author carlos
 */
public class ServiceImplSeller implements ServiceSeller {
    
 
    private final DaoOperator daoOperator = (DaoOperator) ApplicationContext.getDao(DaoEnum.DAO_OPERATOR);
    private final DaoFoodTruck daoTruck = (DaoFoodTruck) ApplicationContext.getDao(DaoEnum.DAO_FOODTRUCK);
    private final DaoSale daoSale = (DaoSale) ApplicationContext.getDao(DaoEnum.DAO_SALE);
    private final DaoSaleCombo daoSaleCombo = (DaoSaleCombo) ApplicationContext.getDao(DaoEnum.DAO_SALE_COMBO);
    private final DaoSaleProduct daoSaleProduct = (DaoSaleProduct) ApplicationContext.getDao(DaoEnum.DAO_SALE_PRODUCT);
    private final DaoSaleComponent daoSaleComponent = (DaoSaleComponent) ApplicationContext.getDao(DaoEnum.DAO_SALE_COMPONENT);
    private final DaoReturn daoReturn = (DaoReturn) ApplicationContext.getDao(DaoEnum.DAO_RETURN);
    private final DaoCombo daoCombo = (DaoCombo) ApplicationContext.getDao(DaoEnum.DAO_COMBO);
    private final DaoProduct daoProduct = (DaoProduct) ApplicationContext.getDao(DaoEnum.DAO_PRODUCT);
    private final DaoComponent daoComponent = (DaoComponent) ApplicationContext.getDao(DaoEnum.DAO_COMPONENT);
    private final Calculator cal = new Calculator();

    @Override
    public MoOperator logIn(DtoSellerLogIn dto) throws DoesNotExistException, IncorrectPasswordException, TruckNotAvailableException{
         
        Operator op = daoOperator.findByUsername(dto.getUsername());
        if(!op.getPassword().equalsIgnoreCase(dto.getPassword())){
            throw new IncorrectPasswordException("The password is incorrect.");
        }
        if(daoTruck.isNotAvailable(dto.getIdTruck())){
            throw new TruckNotAvailableException("This truck is already in use.");
        }
        op.setIdTruck(dto.getIdTruck());
        daoOperator.modify(op);
        return new MoOperator(op.getId(), op.getName(), op.getUsername(), op.getPassword(), daoTruck.findById(dto.getIdTruck()));       
    }

    @Override
    public void reportSale(MoSale moSale) {
        
        Double totalIncome = cal.getTotalIncome(moSale);       
        daoSale.create(new Sale(moSale.getDate(), totalIncome, cal.getTotalProfit(moSale, totalIncome), moSale.getTruck().getId(), moSale.getOperator().getId()));
        for(MoCombo c: moSale.getComboList()){
            daoSaleCombo.create(new SaleCombo(moSale.getId(), c.getId()));
        }
        for(MoProduct p: moSale.getProductList()){
            daoSaleProduct.create(new SaleProduct(moSale.getId(), p.getId()));
        }
        for(Component c: moSale.getComponentList()){
            daoSaleComponent.create(new SaleComponent(moSale.getId(), c.getId()));
        } 
    }

    @Override
    public List<DtoOrder> listOrders(Long idTruck) {      
        List<DtoOrder> orderList = daoSale.findAllFrom(idTruck);
        return orderList;     
    }

    @Override
    public void returnOrder(DtoReturn dto) {
        Sale sale = daoSale.findById(dto.getIdSale());
        daoReturn.create(new Return(sale.getTotalIncome(), sale.getIdTruck() ,sale.getIdOperator(), dto.getDate()));
        daoSale.removeById(dto.getIdSale());
    }

    @Override
    public List<MoCombo> listCombos() {
        List<MoCombo> comboList = daoCombo.findAllCombos();       
        return comboList;
    }

    @Override
    public List<MoProduct> listProducts() {
        List<MoProduct> productList = daoProduct.findAllProducts();
        return productList;
    }

    @Override
    public List<Component> listComponents() {
        List<Component> componentList = daoComponent.findAll();
        return componentList;
    }

    @Override
    public void logOut(MoOperator operator) {
        daoOperator.modify(new Operator(operator.getId(),operator.getName(), operator.getUsername(), operator.getPassword(), 0L));
    }
    
    
}
