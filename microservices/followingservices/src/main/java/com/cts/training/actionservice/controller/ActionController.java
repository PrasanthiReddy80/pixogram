package com.cts.training.actionservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.actionservice.entity.Following;
import com.cts.training.actionservice.repository.FollowingRepository;

@RestController
public class ActionController {

	@Autowired
	private Environment env;
	// dependency
	@Autowired
	private FollowingRepository ActionRepository;
	
	// REST method that will recieve a movie Id and return details of that movie
	// ENDPOINT : /movies/{movieId}
	@GetMapping("/Action/{actionId}")
	public ResponseEntity<Following> movieDetail(@PathVariable Integer movieId){
		Optional<Following> record =  this.ActionRepository.findById(movieId);
		Following movie = new Following();
		if(record.isPresent())
			movie = record.get();
		String port =  env.getProperty("server.port");
		movie.setMovieName(movie.getMovieName() + " (" + port + ")");
		ResponseEntity<Following> response = new ResponseEntity<Following>(movie, HttpStatus.OK);
		return response;
	}
}












