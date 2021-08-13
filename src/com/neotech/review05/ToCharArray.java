package com.neotech.review05;

public class ToCharArray {
	
	public static void main(String[] args) {
		
		String longStr = "I am very happy today, because today is not Monday";
		System.out.println(longStr.length());
		
		
		char[] charArray = longStr.toCharArray();
		System.out.println(charArray.length);
		
		for (int i = 0; i <= charArray.length - 1; i++) {
			System.out.print(charArray[i]);
			
		}
		
		for (char letter : charArray) {
			int code = letter; //find the ASCI code for the character 
			System.out.println(letter + "->" + code );
		}
		
		System.out.println("------------------");
		
		String replce = longStr.replaceAll("a", "e");
		
		System.out.println(replce);
		
		for (char letter :charArray) {
			
			if (letter == 'a')
				System.out.print('e');
			else 
				System.out.print(letter);
		}
		System.out.println();
	}

}
