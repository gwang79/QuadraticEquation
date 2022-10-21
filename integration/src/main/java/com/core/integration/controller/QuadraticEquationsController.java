package com.core.integration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.core.integration.bo.QuadraticEquationsResponse;
import com.core.integration.service.Calculator;
  
@RestController
@RequestMapping("/QuadraticEquations")
public class QuadraticEquationsController {

    public static final String SUCCESS_STATUS = "success";
    public static final String ERROR_STATUS = "error";
    public static final int CODE_SUCCESS = 100;
    public static final int REQUEST_DATA_INVALID = 101;

    @Autowired
    private Calculator calculator;
    
    @GetMapping(value = "/calculate")  
    public QuadraticEquationsResponse calculate(
    		@RequestParam("a") double a, 
    		@RequestParam("b") double b,
    		@RequestParam("c") double c) {
    	String root = calculator.calculateRoots(a, b, c);
    	QuadraticEquationsResponse response;
    	if (root.startsWith("Error")) {
    		response = new QuadraticEquationsResponse("n/a", root, REQUEST_DATA_INVALID);
    	} else {
    		response = new QuadraticEquationsResponse(root, SUCCESS_STATUS, CODE_SUCCESS);	
    	}
    	return response;
    }
}

