package com.cg.Customer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class CustomerExceptionController {

	@ExceptionHandler(value = { CustomerException.class })
	public ResponseEntity<Object> exception(CustomerException exception) {

		return new ResponseEntity<>(exception.getMessage(), HttpStatus.OK);

	}

}
