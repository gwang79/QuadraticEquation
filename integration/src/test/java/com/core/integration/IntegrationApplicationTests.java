package com.core.integration;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.core.integration.controller.QuadraticEquationsController;

@SpringBootTest
class IntegrationApplicationTests {
    @Autowired
    ApplicationContext ac;
    
	@Test
	void contextLoads() {
        QuadraticEquationsController calcController = ac.getBean(QuadraticEquationsController.class);
        assertNotNull(calcController);		
	}

}
