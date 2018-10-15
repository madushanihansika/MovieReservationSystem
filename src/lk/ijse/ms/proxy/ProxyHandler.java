/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ms.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.ms.service.ServiceFactory;
import lk.ijse.ms.service.SuperService;
import lk.ijse.service.custom.CatagoryService;
import lk.ijse.service.custom.MovieDetailService;
import lk.ijse.service.custom.ScheduleService;
import lk.ijse.service.custom.SeatService;
import lk.ijse.service.custom.ThereatService;
import lk.ijse.service.custom.UsersService;

/**
 *
 * @author USER
 */
public class ProxyHandler implements ServiceFactory{

    private static ProxyHandler proxyHandler;
    private ServiceFactory serviceFactory;
    private CatagoryService catagoryService;
    private ThereatService thereatService;
    private ScheduleService scheduleService;
    private MovieDetailService movieDetailService;
    private SeatService seatService;
    private UsersService usersService;
    
    private ProxyHandler(){
        try {
            serviceFactory=(ServiceFactory) Naming.lookup("rmi://localhost:4343/abc");
            catagoryService=(CatagoryService) serviceFactory.getService(ServiceType.CATAGORY);
            thereatService=(ThereatService) serviceFactory.getService(ServiceType.THEREAT);
            scheduleService=(ScheduleService) serviceFactory.getService(ServiceType.SCHEDULE);
            movieDetailService=(MovieDetailService) serviceFactory.getService(ServiceType.MOVIE_DETAIL);
            seatService= (SeatService) serviceFactory.getService(ServiceType.SEAT);
            usersService=(UsersService) serviceFactory.getService(ServiceType.USERS);
        } catch (NotBoundException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ProxyHandler getInstance(){
        if(proxyHandler == null){
            proxyHandler = new ProxyHandler();
        }
        return proxyHandler;
    }
    
    @Override
    public SuperService getService(ServiceType type) throws Exception {
        switch(type){
            case CATAGORY:
                return catagoryService;
            case THEREAT:
                return thereatService;
            case SCHEDULE:
                return scheduleService;
            case MOVIE_DETAIL:
                return movieDetailService;
            case SEAT:
                return seatService;
            case USERS:
                return usersService;
            default:
                return null;
        }
    }
    
}
