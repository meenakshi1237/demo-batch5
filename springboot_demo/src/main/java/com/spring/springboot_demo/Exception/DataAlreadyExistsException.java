package com.spring.springboot_demo.Exception;

public class DataAlreadyExistsException extends Exception {
	private String message;
public DataAlreadyExistsException(String message) {
	super(message);
}
}
