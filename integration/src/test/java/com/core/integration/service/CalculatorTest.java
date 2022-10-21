package com.core.integration.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {
	@ParameterizedTest
	@CsvSource({
		"1, -2, 1, 1.0; 1.0",
		"1, 5, 6, -2.0; -3.0",		      
		"1, 2, 2, -1.0 + i2.0; -1.0 - i2.0",
		"0, -2, 1, Error: The value of 'a' cannot be 0."
	})
	void calculatorTest(double a, double b, double c, String expected) {
		//test code
		Calculator calculator= new Calculator();
		String result = calculator.calculateRoots(a,b,c);
		assertEquals(expected, result);			  
	}		  


}
