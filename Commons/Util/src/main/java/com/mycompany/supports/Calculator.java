/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.supports;

import com.mycompany.entities.Component;
import com.mycompany.model.MoCombo;
import com.mycompany.model.MoProduct;
import com.mycompany.model.MoSale;
import java.util.List;

/**
 *
 * @author carlos
 */
public class Calculator {
    
    public Double getTotalIncome(MoSale sale){
        Double totalIncome = 0.0;
        for(MoCombo combo: sale.getComboList()){
            totalIncome += combo.getPrice();
        }
        for(MoProduct product: sale.getProductList()){
            totalIncome += product.getPrice();
        }
        for(Component component: sale.getComponentList()){
            totalIncome += component.getPrice();
        }
        return totalIncome;
    }
    
    public Double getTotalProfit(MoSale sale, Double totalIncome){
        Double totalProfit = 0.0;
        for(MoCombo combo: sale.getComboList()){
            for(MoProduct p: combo.getProductList()){
                totalProfit -= p.getCost();
            }
        }
        for(MoProduct product: sale.getProductList()){
            totalProfit -= product.getCost();
        }
        for(Component component: sale.getComponentList()){
            totalProfit -= component.getCost();
        }
        totalProfit = totalIncome-totalProfit;
        return totalProfit;
    }
}
