package com.neotech.review11;

public class IQ4 {
	
	//Find out how many alpha characters are present in a String? Find number of words in string?

	public static void main(String[] args) {
		
		String str = "gks#$rfj34 ere @#$56";
		str = str.replaceAll("[^a-zA-Z]", "");		
		System.out.println(str);

		System.out.println("Number of alpha characters is " + str.length());
	
		
		System.out.println("----------------");
		
		String longStr = "bye bye Java hello Selenium";
		
		String[] words = longStr.split(" ");
		
		System.out.println("Number of words in the String is " + words.length); //this is from array and it will count 
		
	}
	
}
