package com.neotech.review01;

import java.util.Scanner;

public class CalculatorString {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the frist numbers");		
		int num1 = input.nextInt();
		
		System.out.println("Enter the second numbers");		
		int num2 = input.nextInt();
		
		System.out.println("Choose operator: +, -, * or /");		
		String operator = input.next();
		
		double result = 0;
		
		if (operator.equals("+")) {
			
			result = num1 + num2 ;

		} else if (operator.equals("-")) {
			
			result = num1 - num2;
			
		} else if (operator.equals("*")) {
			
			result = num1 * num2;
		
		} else if (operator.equals("/")) {
			
			result = num1/num2;
		
		} else {
			
			System.out.println("Invalid operator");
			
		}
		
		System.out.println("The result is " + result);
		
	}

}
