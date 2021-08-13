package com.neotech.review01;

import java.util.Scanner;

public class CalculatorSwitch {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the frist numbers");		
		int num1 = input.nextInt();
		
		System.out.println("Enter the second numbers");		
		int num2 = input.nextInt();
		
		System.out.println("Choose operator: +, -, * or /");		
		String operator = input.next();
		
		int result = 0;
		
		switch (operator) {
		
		case "+":
			result = num1 + num2; break; 
		
		case "-": 
			result = num1 - num2; break;	
		
		case "*":
			result = num1 - num2; break;
		
		case "/":
			result = num1 - num2; break; 
					
		default:
			System.out.println("Invalid operator"); break;
		}
		
		System.out.println("The result is " + result);
		
		// This method is FASTER
		// Limitation of Switch 
		
		// 1. You cannot use logical operators
		// if (num>3 && num < 6)
		
		// 2. You cannnot use double
		// double d =3.4;
		// if (d == 3.4);
		
		// 3. You cannot have duplicate case
		// 4. You should be careful with break 
	}

}
