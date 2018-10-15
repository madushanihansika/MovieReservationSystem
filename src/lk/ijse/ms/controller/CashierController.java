/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ms.controller;

import lk.ijse.ms.dto.AllDTO;
import lk.ijse.ms.proxy.ProxyHandler;
import lk.ijse.ms.service.ServiceFactory;
import lk.ijse.service.custom.CashierService;

/**
 *
 * @author USER
 */
public class CashierController {
    
    public static boolean makeReserve(AllDTO all)throws Exception{
        CashierService cashierService= (CashierService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.CASHIER);
        return cashierService.makeReserve(all);
    }
    
}
