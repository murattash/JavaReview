package com.neotech.review04;

public class MethodWithReturn {
	
	public static void main(String[] args) {
		
		String name = "Hakan";
		int numOfCharacters = name.length();
		
		System.out.println("The length of " + name + " is " + numOfCharacters);
		
		String name2 = "Ozel";
		System.out.println("The length of " + name2 + " is " + name2.length());
	
		//1st method
		MethodWithReturn m = new MethodWithReturn();
		
		System.out.println(m.isOdd(30));
		
		//2nd method 
		boolean res = m.isOdd(17);
		System.out.println("17 is odd -> " + res);
		
	}
	
	
	boolean isOdd (int num) {
			
			boolean result;
			
		if (num % 2 == 1) {
			
			result = true;
			
		} else {
			
			result = false;
		}
		
		return result;
	
	}
	
	
	boolean isOddEnhanced (int num) {
		return (num % 2 == 1);
	}
	
	
	

}
