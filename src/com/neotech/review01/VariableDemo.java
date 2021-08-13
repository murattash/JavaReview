package com.neotech.review01;

public class VariableDemo {
	
	public static void main(String[] args) {
		
		//Declare the variable
		
		String firstName;
		
		//Assign a value, another name "initialize"
		
		firstName = "John";
		
		//Do it in one step, Declare the variable & Assign a value
		
		String lastName = "Smith";
		
		int age = 29;
		
		System.out.println(firstName + " " + lastName + " is " + age + " years old.");
		
		// After some years 
		// Re-assign new value to the variables
		age = age + 3;
		lastName = "Brown";
		
		//Declaring another variable with the same name is not possible
		//String lastName = "Brown";
		
		System.out.println("After getting married:)");
		System.out.println(firstName + " " + lastName + " is " + age + " years old.");
		
		
	}

}
