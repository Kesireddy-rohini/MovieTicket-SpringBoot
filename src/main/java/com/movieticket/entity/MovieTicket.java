package com.movieticket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class MovieTicket {
	
	@Id
	@GeneratedValue 
	private int ticketId;
	private String movieTitle;
	private double ticketPrice;
	private int seatNumber;
	
	public MovieTicket() {
		super();
	}

	public MovieTicket(int ticketId, String movieTitle, double ticketPrice, int seatNumber) {
		super();
		this.ticketId = ticketId;
		this.movieTitle = movieTitle;
		this.ticketPrice = ticketPrice;
		this.seatNumber = seatNumber;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	

	
	

}
