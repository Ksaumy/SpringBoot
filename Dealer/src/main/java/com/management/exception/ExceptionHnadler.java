package com.management.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
	* Author : saumy
	* Date	 : 05-Jan-2025
	* Time   : 12:35:00 pm
*/
@ControllerAdvice
public class ExceptionHnadler
{
@ExceptionHandler (DealerNotFound.class)
public ResponseEntity<String> handleDealerNotFound(DealerNotFound ex)
{
	return new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
}
	
}
