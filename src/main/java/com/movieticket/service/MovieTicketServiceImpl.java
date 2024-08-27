package com.movieticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieticket.dao.MovieTicketDao;
import com.movieticket.entity.MovieTicket;

@Service
public class MovieTicketServiceImpl implements MovieTicketService{

	@Autowired
	MovieTicketDao movieTicketDao;
	@Override
	public MovieTicket saveMovieTicketDetails(MovieTicket movieTicket) {
		
		return movieTicketDao.saveMovieTicketDetails(movieTicket);
	}
	@Override
	public void deleteTicketById(int ticketId) {
		
		movieTicketDao.deleteTicketById(ticketId);
	}
	@Override
	public MovieTicket getMovieTicketById(int ticketId) {
		
		return movieTicketDao.getMovieTicketById(ticketId);
	}
	@Override
	public MovieTicket updateMovieTicketDetails(MovieTicket movieTicket) {
		
		return movieTicketDao.updateMovieTicketDetails(movieTicket);
	}

}
