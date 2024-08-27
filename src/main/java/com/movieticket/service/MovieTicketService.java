package com.movieticket.service;

import com.movieticket.entity.MovieTicket;

public interface MovieTicketService {

	public MovieTicket saveMovieTicketDetails(MovieTicket movieTicket);

	public void deleteTicketById(int ticketId);

	public MovieTicket getMovieTicketById(int ticketId);

	public MovieTicket updateMovieTicketDetails(MovieTicket movieTicket);

}
