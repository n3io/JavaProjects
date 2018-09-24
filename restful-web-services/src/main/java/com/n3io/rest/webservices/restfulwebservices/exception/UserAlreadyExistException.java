package com.n3io.rest.webservices.restfulwebservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class UserAlreadyExistException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6184991468302657178L;

	public UserAlreadyExistException(String message) {
		super(message);
		
	}
	
}
