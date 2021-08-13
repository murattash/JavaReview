package com.neotech.review01;

import java.util.Scanner;

public class CalculatorChar {
	
	public static void main(String[] args) {
		
		//Ask user to enter 2 number
		//Ask user for the operator (+,-,*,/)
		
		//cmd + shift + o >> will import the class 
		
		//if using String use equals method in the "if" section --->>  if (namePicked.equals("+")) > DO NOT use if (operator == "+");
	
	Scanner input = new Scanner (System.in);
			
	System.out.println("Enter the frist numbers");		
	int num1 = input.nextInt();
	
	System.out.println("Enter the second numbers");		
	int num2 = input.nextInt();
	
	System.out.println("Choose operator: plus, minus, multiplication or division");		
	char operator = input.next().charAt(0);
	
	if (operator == '+') {
		
		System.out.println(num1 + num2);

	} else if (operator == '-') {
		
		System.out.println(num1 - num2);
		
	} else if (operator == '*') {
		
		System.out.println(num1 * num2);
	
	} else if (operator == '/') {
		
		System.out.println(num1/num2);
	
	} else {
		
		System.out.println("Invalid data");
		
	}
	
		
	}

}
