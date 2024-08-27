package com.movieticket.dao;

import com.movieticket.entity.MovieTicket;

public interface MovieTicketDao {

	public MovieTicket saveMovieTicketDetails(MovieTicket movieTicket);

	public String deleteTicketById(int ticketId);

	public MovieTicket getMovieTicketById(int ticketId);

	public MovieTicket updateMovieTicketDetails(MovieTicket movieTicket);

}
