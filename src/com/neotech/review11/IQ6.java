package com.neotech.review11;

public class IQ6 {
	
	//Write a Java Program to find whether a String is palindrome or not?

	public static void main(String[] args) {
		
		String original = "Hakan";
		
		StringBuffer sb = new StringBuffer(original);
		
		sb.reverse();
		
		if (original.equals(sb)) {
			System.out.println("This original word is palindrom");
		} else {
			System.out.println("Orignal word is not palindrom");
		}
		
		
	}
	
	
	
}
