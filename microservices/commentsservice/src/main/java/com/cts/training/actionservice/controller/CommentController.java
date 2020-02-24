package com.cts.training.actionservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.actionservice.entity.Comment;
import com.cts.training.actionservice.repository.CommentRepository;

@RestController
public class CommentController {

	@Autowired
	private Environment env;
	// dependency
	@Autowired
	private CommentRepository CommentRepository;
	
	// REST method that will recieve a movie Id and return details of that movie
	// ENDPOINT : /movies/{movieId}
	@GetMapping("/comment/{commentId}")
	public ResponseEntity<Comment> movieDetail(@PathVariable Integer movieId){
		Optional<Comment> record =  this.CommentRepository.findById(movieId);
		Comment comment = new Comment();
		if(record.isPresent())
			comment = record.get();
		String port =  env.getProperty("server.port");
		comment.setCommentName(comment.getComments() + " (" + port + ")");
		ResponseEntity<Comment> response = new ResponseEntity<Comment>(comment, HttpStatus.OK);
		return response;
	}
}












