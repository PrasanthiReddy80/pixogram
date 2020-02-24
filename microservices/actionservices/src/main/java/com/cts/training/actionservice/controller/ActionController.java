package com.cts.training.actionservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.actionservice.entity.Action;
import com.cts.training.actionservice.repository.ActionRepository;

@RestController
public class ActionController {

	@Autowired
	private Environment env;
	// dependency
	@Autowired
	private ActionRepository ActionRepository;
	
	// REST method that will recieve a movie Id and return details of that movie
	// ENDPOINT : /movies/{movieId}
	@GetMapping("/Action/{actionId}")
	public ResponseEntity<Action> movieDetail(@PathVariable Integer actionId){
		Optional<Action> record =  this.ActionRepository.findById(actionId);
		Action action = new Action();
		if(record.isPresent())
			action = record.get();
		
		ResponseEntity<Action> response = new ResponseEntity<Action>(action, HttpStatus.OK);
		return response;
	}
}












