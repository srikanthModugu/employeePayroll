package com.autoplant.empr.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.autoplant.empr.model.Error;

@RestControllerAdvice
public class GlobalExceptionHandler {


	@ExceptionHandler
	public ResponseEntity<Error> handle(Exception ex) {
		ex.printStackTrace();
		return new ResponseEntity<Error>(new Error("Failed to add the Data",400),HttpStatus.BAD_REQUEST);
	}
}
