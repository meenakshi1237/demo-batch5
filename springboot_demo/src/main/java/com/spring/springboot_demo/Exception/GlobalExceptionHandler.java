package com.spring.springboot_demo.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(DataAlreadyExistsException.class)
public ResponseEntity dataExist(DataAlreadyExistsException e) {
	return ResponseEntity.badRequest().body(e.getMessage());
}
	
}
