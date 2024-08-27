package com.movieticket.repository;

import org.springframework.data.repository.CrudRepository;

import com.movieticket.entity.MovieTicket;

public interface MovieTicketRepo extends CrudRepository<MovieTicket, Integer>{

}
