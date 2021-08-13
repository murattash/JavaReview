package com.neotech.review04;

public class ReplaceDemo {
	
	public static void main(String[] args) {
		
		String longStr = "I am very happy today because it is not Monday";
		
		String anohterStr = longStr.replace('a', 'e');
		System.out.println(anohterStr);
		
		anohterStr = longStr.replace("today", "tomorrow");
		System.out.println(anohterStr);
		
		System.out.println("-------------------");
		
		//Regular expression
		anohterStr = longStr.replaceAll("[a-z]", "*");
		System.out.println(anohterStr);
		
		String ssn = "232-152-5432";
		
		String newSSN = ssn.replaceAll("[0-9]", "*");
		System.out.println(newSSN);
		
		System.out.println("Let's remove the dashes from ssn");
		newSSN = ssn.replaceAll("[^0-9]", "");
		System.out.println(newSSN);
		
		System.out.println("---------");
		
		
		
		String newSSN1 = ssn.substring(8, 12);
		String newSSN2 = ssn.replaceAll("[0-9]", "*");
		String newSSN3 = newSSN2.substring(0, 8);
		String newSSN4 = "SSN is ".concat(newSSN3).concat(newSSN1);
		System.out.println(newSSN4);
		
	}

}
