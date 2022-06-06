package com.neotech.review11;

public class IQ1 {
	
	// Write a program to swap 2 numbers without a temporary variable? 
	// Swap 2 strings without a temporary variable?
	
	public static void main(String[] args) {
		
		int a = 11;
		int b = 6;
		
//		int temp = b; //using temporary variable
//		b = a;
//		a = temp;
		
		a = a + b; // a = 17; b = 6
		
		b = a - b; // b = 11; a = 17
		
		a = a - b; // b = 6; a = 11
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("-----------------");
		
		String str1 = "Flori";
		String str2 = "Komron";
		
		str1 = str1 + str2; //str1 = FloriKomron; str2 = Komron;
		str2 = str1.substring(0, str1.length() - str2.length()); //str1 = FloriKomron; str2 = Flori;	
		
		str1 = str1.substring(str2.length()); 
		
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
