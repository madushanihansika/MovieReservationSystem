/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ms.controller;

import java.util.List;
import lk.ijse.ms.dto.CatagoryDTO;
import lk.ijse.ms.dto.MovieDetailDTO;
import lk.ijse.ms.dto.ScheduleDTO;
import lk.ijse.ms.dto.ThereatDTO;
import lk.ijse.ms.observer.Subject;
import lk.ijse.ms.proxy.ProxyHandler;
import lk.ijse.ms.service.ServiceFactory;
import lk.ijse.service.custom.MovieDetailService;

/**
 *
 * @author USER
 */
public class MovieDetailController {
 
    public static boolean addMovieDetail(MovieDetailDTO movieDetailDTO)throws Exception{
        MovieDetailService movieDetailService= (MovieDetailService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.MOVIE_DETAIL);
        return movieDetailService.addMovieDetail(movieDetailDTO);
    }
    
    public static boolean updateMovieDetail(CatagoryDTO catagory,ThereatDTO thereat,ScheduleDTO schedule,MovieDetailDTO movieDetailDTO)throws Exception{
        MovieDetailService movieDetailService= (MovieDetailService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.MOVIE_DETAIL);
        return movieDetailService.updateMovieDetail(catagory, thereat, schedule, movieDetailDTO);
    }
    
    public static boolean deleteMovieDetail(String movieId)throws Exception{
        MovieDetailService movieDetailService= (MovieDetailService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.MOVIE_DETAIL);
        return movieDetailService.deleteMovieDetail(movieId);
    }
    
    public static List<MovieDetailDTO>getAllMovieDetail()throws Exception{
        MovieDetailService movieDetailService= (MovieDetailService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.MOVIE_DETAIL);
        return movieDetailService.getAllMovieDetail();
    }
    
    public static Subject getSubject()throws Exception{
        return (Subject) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.CATAGORY);
    }
    
    public MovieDetailDTO findById(String id) throws Exception{
        MovieDetailService movieDetailService= (MovieDetailService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.MOVIE_DETAIL);
        return movieDetailService.findById(id);
    }

    public static MovieDetailDTO searchMovieDetail(String movieName) throws Exception{
        MovieDetailService movieDetailService= (MovieDetailService) ProxyHandler.getInstance().getService(ServiceFactory.ServiceType.MOVIE_DETAIL);
        return movieDetailService.search(movieName);
    }
}
