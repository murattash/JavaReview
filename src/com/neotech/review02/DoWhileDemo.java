package com.neotech.review02;

public class DoWhileDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Similarity between while and do-while");
		
		int age = 1;
		while (age <= 10)
		{
			System.out.println("Happy birthday. You are " + age + " years old!" ); //This will print until it hits 10 and then move to next sysout
			age++;
			
			//System.out.println("Now you are too big. No more birthdays."); //do not put it here, it will print after each HB.
		}	
		System.out.println("Now you are too big. No more birthdays.");
			
		
		
		System.out.println("-------------------------------------------");
		
		
		
		int age2 = 1;
		do {	
			System.out.println("Happy birthday. You are " + age2 + " years old!");
			age2++;	
		} while (age2 <=10);
		System.out.println("Now you are too big. No more birthdays.");
		
		
		
		System.out.println();
		System.out.println("Differences between while and do-while");
		
		
		
		boolean happy = false;
		while (happy)
		{
			System.out.println("Bye-while");	
		}
			
		
		do { //does not check conditions at the first stage, so it will print the statement	
			System.out.println("Bye - do-while");
		} while (happy);
		
		
		
		
		
		
		
		
	}

}
