package com.neotech.review04;

public class SubstringDemo {
	
	public static void main(String[] args) {
		
		String longStr = "I am very happy today because it is not Monday";
		
		String anotherStr = longStr.substring(5, 7);
		System.out.println(anotherStr);
		
		anotherStr = longStr.substring(5);
		System.out.println(anotherStr);
		
		
		
	}

}
