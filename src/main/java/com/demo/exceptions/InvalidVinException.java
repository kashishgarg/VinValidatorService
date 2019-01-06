package com.demo.exceptions;

public class InvalidVinException extends RuntimeException {
	
	public InvalidVinException() {
		super();
	}
	
	public InvalidVinException(String message) {
		super(message);
	}
	
	public InvalidVinException(Throwable cause) {
		super(casue);
	}
	
	public InvalidVinException(String message, Throwable cause) {
		super(message, cause);
	}
}
