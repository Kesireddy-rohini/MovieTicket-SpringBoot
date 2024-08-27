package com.movieticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movieticket.entity.MovieTicket;
import com.movieticket.service.MovieTicketService;

@RestController
public class MovieTicketController {
	
	@Autowired
	MovieTicketService movieTicketService;
	
	@PostMapping("/saveMovieTicketDetails")
	public MovieTicket saveMovieTicketDetails(@RequestBody MovieTicket movieTicket) {
		
		return movieTicketService.saveMovieTicketDetails(movieTicket);
		
	}
	
	@DeleteMapping("/deleteMovieTicketById/{ticketId}")
	public void deleteTicketById(@PathVariable int ticketId) {
		
		 movieTicketService.deleteTicketById(ticketId);
	
		
	}
	@GetMapping("/getMovieTicketById")
	public MovieTicket getMovieTicketById(@RequestParam int ticketId) {
		
		return movieTicketService.getMovieTicketById(ticketId);
		
	}
	
	@PutMapping("/updateMovieTicketDetails")
	public MovieTicket updateMovieTicketDetails(@RequestBody MovieTicket movieTicket) {
		return movieTicketService.updateMovieTicketDetails(movieTicket);
		
	}

}
