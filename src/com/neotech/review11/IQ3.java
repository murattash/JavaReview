package com.neotech.review11;

public class IQ3 {
	
	// Write a Java Program to print first 10 numbers of Fibonacci series.

	public static void main(String[] args) {
		
		
		int a = 1;
		int b = 1;
		int next;
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.print(a + ", ");
			next = a + b; //find the next number
			a = b; //shift a
			b = next; //shift b
		}
		
		System.out.println("\n--------------");
		
		int num1 = 1;
		int num2 = 2;
		
		for (int i = 1; i <=10; i++) {
			System.out.print(num1 + ", ");
			num2 = num2 + num1;
			num1 = num2 - num1;
		}
		
	}
	
}
