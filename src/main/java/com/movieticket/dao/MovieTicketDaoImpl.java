package com.movieticket.dao;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.movieticket.entity.MovieTicket;
import com.movieticket.repository.MovieTicketRepo;

@Repository
public class MovieTicketDaoImpl implements MovieTicketDao {

	@Autowired
	private MovieTicketRepo movieTicketRepo;
	
	@Override
	public MovieTicket saveMovieTicketDetails(MovieTicket movieTicket) {
		
		return movieTicketRepo.save(movieTicket);
	}

	@Override
	public String deleteTicketById(int ticketId) {
		
		movieTicketRepo.deleteById(ticketId);
		return "TicketDetails are deleted";
	}

	@Override
	public MovieTicket getMovieTicketById(int ticketId) {
		
		Optional<MovieTicket> m = movieTicketRepo.findById(ticketId);
		return m.get();
	}

	@Override
	public MovieTicket updateMovieTicketDetails(MovieTicket movieTicket) {
		Optional<MovieTicket> m = movieTicketRepo.findById(movieTicket.getTicketId());
		MovieTicket m1 = m.get();
		m1.setTicketPrice(movieTicket.getTicketPrice());
		movieTicketRepo.save(m1);
		return m1;
	}

}
