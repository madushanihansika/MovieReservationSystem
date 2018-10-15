/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ms.controller;

import java.util.List;
import lk.ijse.ms.dto.CatagoryDTO;
import lk.ijse.ms.observer.Subject;
import lk.ijse.ms.proxy.ProxyHandler;
import lk.ijse.ms.service.ServiceFactory;
import lk.ijse.service.custom.CatagoryService;

/**
 *
 * @author USER
 */
public class CatagoryController {
 
    public static boolean addCatagory(CatagoryDTO catagory)throws Exception{
        CatagoryService catagoryService=(CatagoryService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.CATAGORY);
        return catagoryService.addCatagory(catagory);
    }
    
    public static boolean updateCatagory(CatagoryDTO catagory)throws Exception{
        CatagoryService catagoryService=(CatagoryService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.CATAGORY);
        return catagoryService.updateCatagory(catagory);
    }
    
    public static boolean deleteCatagory(String catagoryId)throws Exception{
        CatagoryService catagoryService=(CatagoryService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.CATAGORY);
        return catagoryService.deleteCatagory(catagoryId);
    }
    
    public static List<CatagoryDTO>getAllCatagory()throws Exception{
        CatagoryService catagoryService=(CatagoryService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.CATAGORY);
        return catagoryService.getAllCatagorys();
    }
    
    public static Subject getSubject()throws Exception{
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.CATAGORY);
    }
    
    public static CatagoryDTO findById(String id) throws Exception{
        CatagoryService catagoryService=  (CatagoryService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.CATAGORY);
        return catagoryService.findById(id);
    }
    
}
