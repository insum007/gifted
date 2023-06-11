package com.godeltechnologies.bank.exception;

import java.time.Instant;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
	
	 private final HttpStatus status;
     private final String message;
     private final Instant timestamp;
     
	public ErrorResponse(HttpStatus status, String message, Instant timestamp) {
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public String getMessage() {
		return message;
	}
	public Instant getTimestamp() {
		return timestamp;
	}
  
}
