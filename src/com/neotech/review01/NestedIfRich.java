package com.neotech.review01;

import java.util.Scanner;

public class NestedIfRich {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Are you a boy or a girl");
		String gender = input.next();
		
		System.out.println("Are you rich or poor? True or False");
		//String income = input.next();
		boolean rich = input.nextBoolean();
		
		
		if (gender.equalsIgnoreCase("boy")) { 
			
				System.out.println("It is a Boy");
			
			if (rich) 
			
				{ System.out.println("Buy a Ferrari"); } 
				
			else 
			
				{ System.out.println("Play soccer"); }
			
	
	} else if (gender.equalsIgnoreCase("girl")) 
		  
				{ System.out.println("It is a girl");
			
			if (rich) 
			
				{ System.out.println("Buy a LV bag"); }
			
			else 
			
				{ System.out.println("Read a book"); }
		
	} else 
		
				{ System.out.println("Invalid gender!"); }
		
	
		
	}
	
}
