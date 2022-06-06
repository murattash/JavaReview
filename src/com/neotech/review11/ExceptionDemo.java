package com.neotech.review11;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		//divide(6, 0);
		divide(6, 2);
		
	}	

	
	public static void divide (int a, int b) {
				
		try {
			//int result = 0;
			int result = a/b; 
			System.out.println(result);
			
		} catch(ArithmeticException ex) { //don't put too much code here because it will be hard to tell where the error is coming
			System.out.println("Something went wrong");
			
			System.out.println("Exception -> " + ex);
			System.out.println("Exception message -> " + ex.getMessage());
			
			ex.printStackTrace();
		}		
				
		
		System.out.println("Continue executing extra code...");
	}
	
}
