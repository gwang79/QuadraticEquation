package com.core.integration.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.core.integration.controller.QuadraticEquationsController;

public class QuadraticEquationsControllerTest {
	@ParameterizedTest
	@CsvSource({
		"1, -2, 1, 1.0; 1.0",
		"1, 2, 2, -1.0 + i2.0; -1.0 - i2.0",
		"0, -2, 1, n/a"
	})
	void controllerTest(double a, double b, double c, String expected) {
		QuadraticEquationsController qc = new QuadraticEquationsController();
		assertEquals(expected, qc.calculate(a, b, c).getRoot());
	}
}
