package com.neotech.review07;

public class OverloadingMainMethod {
	
	// Can we overload main method? Yes
	// Can I have another method with name main in the same class? 
	
	public static void main(String[] args) {
		//Java looks for a main method with this signature 
		//Method signature = method name (main) + parameters (String array) 
		System.out.println("Main method with String parameters");
		
		main("Hi", "Bye");
		
		main(4, 7);
		
		int[] arr = {2, 3};
		main(arr); // Compile time polymorphism > which method will be executed 
		//Polymorphism
		//Method overloading: early binding/static binding
		
		
		
	}

	public static void main(int[] args) {
		System.out.println("Main method with int array parameters");
	}
	
	public static void main(int num1, int num2) {
		System.out.println("Main method with two int parameters");
	}
	
	public static void main(String str1, String str2) {
		System.out.println("Main method with two String parameters");
	}
}
