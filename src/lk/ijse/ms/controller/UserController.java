/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ms.controller;

import java.util.List;
import lk.ijse.ms.dto.UsersDTO;
import lk.ijse.ms.observer.Subject;
import lk.ijse.ms.proxy.ProxyHandler;
import lk.ijse.ms.service.ServiceFactory;
import lk.ijse.service.custom.UsersService;

/**
 *
 * @author USER
 */
public class UserController {
    
    public static boolean addUser(UsersDTO user) throws Exception{
        UsersService userService = (UsersService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.USERS);
        return userService.addUser(user);
    }
    
    public static boolean updateUser(UsersDTO user) throws Exception{
        UsersService userService = (UsersService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.USERS);
        return userService.updateUser(user);
    }
    
    public static boolean deleteUser(String name) throws Exception{
        UsersService userService = (UsersService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.USERS);
        return userService.deleteUser(name);
    }
    
    public static List<UsersDTO> getAllUser() throws Exception{
        UsersService userService = (UsersService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.USERS);
        return userService.getAllUsers();
    }
    
    public static UsersDTO getUserByName(String name) throws Exception{
        UsersService userService = (UsersService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.USERS);
        return userService.getUserByName(name);
    }
    
    public static Subject getSubject() throws Exception{
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.USERS);
    }
    
}
