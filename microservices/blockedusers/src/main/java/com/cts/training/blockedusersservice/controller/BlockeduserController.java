package com.cts.training.blockedusersservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.blockedusersservice.entity.BlockedUsers;

import ch.qos.logback.core.joran.action.Action;
import javassist.bytecode.analysis.ControlFlow.Block;


@RestController
public class BlockeduserController{

	@Autowired
	private Environment env;
	// dependency
	@Autowired
	private BlockedUserRepository BlockedUserRepository;
	
	// REST method that will recieve a movie Id and return details of that movie
	// ENDPOINT : /movies/{movieId}
	@GetMapping("BlockedUser/{BlockedUserId}")
	public ResponseEntity<BlockedUser> movieDetail(@PathVariable Integer movieId){
		Optional<Action> record =  this.BlockedUser.findById(movieId);
		BlockedUsers block = new BlockedUsers();
		if(record.isPresent())
			block = record.get();
		String port =  env.getProperty("server.port");
		block.setBlockName(block.getBlockeduserid() + " (" + port + ")");
		ResponseEntity<Block> response = new ResponseEntity<Block>(HttpStatus.OK);
		return response;
	}
}





