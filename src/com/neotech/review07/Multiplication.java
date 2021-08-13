package com.neotech.review07;

public class Multiplication {
	
	
	// Method overloading: the name of the method should be the same
	// Method signature = method name + parameter (should be unique)
	public static void multiply (int num1, int num2) {
			int result = num1 * num2;
			System.out.println(result);
	}
	
	public static void multiply(int num1, int num2, int num3) {
		System.out.println(num1 * num2 * num3);
	}
	
	//is this method overloading the other two methods
	public void multiply (double d1, double d2) {
		System.out.println(d1 * d2);
	}
	
	public static void multiply(int[] numbers) {
		//Task: multiply all the numbers in the array
		int result = 1;				
		for (int num : numbers) {
			result = result * num;
		}
		System.out.println("The result for an array is " + result);
	}
	
	
	
	public static void main(String[] args) {
		multiply(2, 3);
		multiply(4, 5, 7);
		
		int[] array = {2, 5, 4, 3};
		multiply(array);
		
	}

}
