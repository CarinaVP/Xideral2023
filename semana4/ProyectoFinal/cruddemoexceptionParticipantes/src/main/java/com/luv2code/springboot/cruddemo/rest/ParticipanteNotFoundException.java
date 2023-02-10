package com.luv2code.springboot.cruddemo.rest;

public class ParticipanteNotFoundException extends RuntimeException {

	public ParticipanteNotFoundException() {
	}

	public ParticipanteNotFoundException(String message) {
		super(message);
	}

	public ParticipanteNotFoundException(Throwable cause) {
		super(cause);
	}

	public ParticipanteNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ParticipanteNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
