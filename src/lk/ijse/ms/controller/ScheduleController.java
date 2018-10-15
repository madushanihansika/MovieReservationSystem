/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ms.controller;

import java.util.List;
import lk.ijse.ms.dto.ScheduleDTO;
import lk.ijse.ms.dto.ThereatDTO;
import lk.ijse.ms.observer.Subject;
import lk.ijse.ms.proxy.ProxyHandler;
import lk.ijse.ms.service.ServiceFactory;
import lk.ijse.service.custom.ScheduleService;

/**
 *
 * @author USER
 */
public class ScheduleController {

    public static boolean addSchedule(ScheduleDTO schedule) throws Exception {
        ScheduleService scheduleService = (ScheduleService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.SCHEDULE);
        return scheduleService.addSchedule(schedule);
    }

    public static boolean updateSchedule(ScheduleDTO schedule) throws Exception {
        ScheduleService scheduleService = (ScheduleService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.SCHEDULE);
        return scheduleService.updateSchedule(schedule);
    }

    public static boolean deleteSchedule(String scheduleId) throws Exception {
        ScheduleService scheduleService = (ScheduleService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.SCHEDULE);
        return scheduleService.deleteSchedule(scheduleId);
    }

    public static List<ScheduleDTO> getAllSchedule() throws Exception {
        ScheduleService scheduleService = (ScheduleService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.SCHEDULE);
        return scheduleService.getAllSchedule();
    }

    public static Subject getSubject() throws Exception {
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.SCHEDULE);
    }

    public static ScheduleDTO findById(String id) throws Exception {
        ScheduleService scheduleService = (ScheduleService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.SCHEDULE);
        return scheduleService.findById(id);
    }

    public static ScheduleDTO findByTime(String time) throws Exception {
        ScheduleService scheduleService = (ScheduleService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.SCHEDULE);
        return scheduleService.findByime(time);
    }

}
