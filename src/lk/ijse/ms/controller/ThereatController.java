/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ms.controller;

import java.util.List;
import lk.ijse.ms.dto.ThereatDTO;
import lk.ijse.ms.observer.Subject;
import lk.ijse.ms.proxy.ProxyHandler;
import lk.ijse.ms.service.ServiceFactory;
import lk.ijse.service.custom.ThereatService;

/**
 *
 * @author USER
 */
public class ThereatController {
    
    public static boolean addThereat(ThereatDTO thereat)throws Exception{
        ThereatService thereatService= (ThereatService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.THEREAT);
        return thereatService.addThereat(thereat);
    }
    
    public static boolean updateThereat(ThereatDTO thereat)throws Exception{
        ThereatService thereatService=(ThereatService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.THEREAT);
        return thereatService.updateThereat(thereat);
    }
    
    public static boolean deleteThereat(String thereatId)throws Exception{
        ThereatService thereatService=(ThereatService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.THEREAT);
        return thereatService.deleteThereat(thereatId);
    }
    
    public static List<ThereatDTO>getAllThereat()throws Exception{
        ThereatService thereatService=(ThereatService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.THEREAT);
        return thereatService.getAllThereats();
    }
    
    public static Subject getSubject()throws Exception{
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.THEREAT);
    }
    
    public static ThereatDTO findById(String id) throws Exception{
        ThereatService thereatService=  (ThereatService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.THEREAT);
        return thereatService.findById(id);
    }
    
}
