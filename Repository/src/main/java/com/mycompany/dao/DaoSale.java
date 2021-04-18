/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.dto.DtoOrder;
import com.mycompany.entities.Sale;
import java.util.List;

/**
 *
 * @author carlos
 */
public abstract class DaoSale implements GenericCreator<Sale>{

    public abstract List<DtoOrder> findAllFrom(Long idTruck);   
}
