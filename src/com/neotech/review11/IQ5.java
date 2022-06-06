package com.neotech.review11;

public class IQ5 {

	//	Write a java program to reverse String? Reverse a string word by word?
	//			1. Neotech -> hcetoeN
	//			2. I love Java very much -> much very Java love I

	public static void main(String[] args) {

		String str = "Neotech";
		
		String str1 = "much very Java love I";
		
		// 1st way, using charAt method
		// Starting from the last character to the last one 
		String reverse1 = "";

		for (int i = str.length()-1; i >= 0; i--) {
			reverse1 += str.charAt(i); // we use char to put index in the empty String	
		}
		System.out.println("The reversed1 string is " + reverse1);
		
		
		
		
		// 2nd way, using toCharArray()
		String reverse2 = "";
		
		char[] array = str.toCharArray();
		//Getting the char from the array one by one, backwards
		
		for (int i = array.length - 1; i >= 0; i--) {
			reverse2 += array[i]; //get the char from chArray using index i 
		}
		System.out.println("The reversed2 string is " + reverse2);
		
		
		
		// 3rd way using StringBuffer
		StringBuffer sb = new StringBuffer(str);
		sb.reverse(); //StringBuffer is mutable
		
		System.out.println("The reversed3 string is " + sb);
		
		
		System.out.println("---------------------------------");
		
		String[] words = str1.split(" ");
		String reverse4 = "";
		
		for (int i = words.length - 1; i >= 0; i--) {
			
			reverse4 += words[i] + " ";
		}
		System.out.println(reverse4);
		
		
		
		
		
		
		
	}
}
