package com.covid.exception;

import jakarta.annotation.PostConstruct;

public class IdCardException extends RuntimeException{

	public IdCardException() {
		// TODO Auto-generated constructor stub
	}
	
	public IdCardException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
