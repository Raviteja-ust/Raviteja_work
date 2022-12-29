package com.ust.labour.labourPoint.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class LabourExceptionController extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(LabourNotFoundException.class)
	public final ResponseEntity<Object> handleExceptions(Exception ex, WebRequest request) throws Exception {
		ExceptionResponse response = new ExceptionResponse();
		response.setMessage("Not Found");
		response.setTimestamp(LocalDateTime.now());
		return new ResponseEntity<Object>(response, HttpStatus.NOT_FOUND);
	}
}
