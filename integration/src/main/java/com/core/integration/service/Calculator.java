package com.core.integration.service;
import static java.lang.Math.*;

import org.springframework.stereotype.Component;  
@Component
public class Calculator {
	//defining a static method that finds the roots of the quadratic equation  
	public static String calculateRoots(double a, double b, double c)  
	{  
		String result = "";
		//comparing the value of a with 0, if a is 0 then the equation is not quadratic   
		if (a == 0.0) {  
			result = "Error: The value of 'a' cannot be 0.";
			System.out.println(result);
			return result;
		}  
		//calculating discriminant (d)  
		double d = b * b - 4 * a * c;  
		double sqrtval = sqrt(abs(d));  
		if (d > 0) {  
			System.out.println("The roots of the equation are real and different. \n");  			
			result = (double)(-b + sqrtval) / (2 * a) + "; "+ (double)(-b - sqrtval) / (2 * a);
		} else if (d == 0) {  
			System.out.println("The roots of the equation are real and same. \n");  
			result = -(double)b / (2 * a) + "; "+ -(double)b / (2 * a);
		} else {   
			// executes if d < 0   
			System.out.println("The roots of the equation are complex and different. \n");  
			result = -(double)b / (2 * a) + " + i"+ sqrtval + "; "+ -(double)b / (2 * a)+ " - i" + sqrtval;
		} 
		return result;
	}
}