package com.core.integration.exception;

import java.net.http.HttpHeaders;
import java.nio.file.AccessDeniedException;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.core.integration.bo.QuadraticEquationsResponse;
import com.core.integration.controller.QuadraticEquationsController;

@ControllerAdvice
public class RestExceptionHandler {
	
    @ExceptionHandler({ org.springframework.web.bind.MissingServletRequestParameterException.class,
    	java.lang.NumberFormatException.class})
    public ResponseEntity<QuadraticEquationsResponse> handleMissingServletRequestParameterException(
      Exception ex, WebRequest request) {
     
      return new ResponseEntity<QuadraticEquationsResponse>(
    		  new QuadraticEquationsResponse("n/a", ex.getMessage(),  HttpStatus.BAD_REQUEST.value()) , HttpStatus.BAD_REQUEST);        
    }
    @ExceptionHandler({ Exception.class})
    public ResponseEntity<QuadraticEquationsResponse> handleAllException(
      Exception ex, WebRequest request) {
     
      return new ResponseEntity<QuadraticEquationsResponse>(
    		  new QuadraticEquationsResponse("n/a", ex.getMessage(),  HttpStatus.BAD_REQUEST.value()) , HttpStatus.BAD_REQUEST);        
    }    
}
