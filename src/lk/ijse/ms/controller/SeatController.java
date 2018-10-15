/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ms.controller;

import java.util.List;
import lk.ijse.ms.dto.SeatDTO;
import lk.ijse.ms.observer.Subject;
import lk.ijse.ms.proxy.ProxyHandler;
import lk.ijse.ms.service.ServiceFactory;
import lk.ijse.service.custom.SeatService;

/**
 *
 * @author USER
 */
public class SeatController {
    
    public static boolean addSeat(SeatDTO seat)throws Exception{
        SeatService seatService= (SeatService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.SEAT);
        return seatService.addSeat(seat);
    }
    
    public static boolean updateSeat(SeatDTO seat)throws Exception{
        SeatService seatService=  (SeatService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.SEAT);
        return seatService.updateSeat(seat);
    }
    
    public static boolean deleteSeat(String seatId)throws Exception{
        SeatService seatService=  (SeatService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.SEAT);
        return seatService.deleteSeat(seatId);
    }
    
    public static List<SeatDTO>getAllSeat()throws Exception{
        SeatService seatService=  (SeatService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.SEAT);
        return seatService.getAllSeat();
    }
    
    public static Subject getSubject()throws Exception{
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.SEAT);
    }
    
    public static SeatDTO findById(String id) throws Exception{
        SeatService seatService=  (SeatService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.SEAT);
        return seatService.findById(id);
    }
    
    public static boolean reserveCustomer(int seatNo) throws Exception{
        SeatService seatService = (SeatService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.SEAT);
        return seatService.reserve(seatNo);
    }
    
    public static boolean releaseCustomer(int seatNo) throws Exception{
        SeatService seatService = (SeatService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.SEAT);
        return seatService.release(seatNo);
    }  
    
}
