package com.luv2code.springboot.cruddemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ParticipanteRestExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<ParticipanteErrorResponse> handleException(ParticipanteNotFoundException exc) {
		
		
		ParticipanteErrorResponse error = new ParticipanteErrorResponse(
											HttpStatus.NOT_FOUND.value(),
											exc.getMessage(),
											System.currentTimeMillis());
		
		// return ResponseEntity
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	

	@ExceptionHandler
	public ResponseEntity<ParticipanteErrorResponse> handleException(Exception exc) {
		
		// create CustomerErrorResponse
		
		ParticipanteErrorResponse error = new ParticipanteErrorResponse(
											HttpStatus.BAD_REQUEST.value(),
											exc.getMessage(),
											System.currentTimeMillis());
		
		// return ResponseEntity
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
}





