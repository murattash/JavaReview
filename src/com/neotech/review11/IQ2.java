package com.neotech.review11;

public class IQ2 {
	
	// Write a java program to check whether a given number is prime or not?
	// prime numbers if number that is greater than 1. Number 1 is not prime.
	// prime numbers if divisible only by 1 and itself
	
	public static void main(String[] args) {
	
		int number = 1; // 15 is divisible by 1, 3, 5, 15; So, it is NOT Prime
		boolean prime = true;
		
		for (int i = 0; i < number; i++) {
			
		if (number == 1) {
			prime = false;
			
		} else {
			
			if(number % i == 0) { //if you divide number by i and it returns 0 
				
				System.out.println(number + " is divisable by " + i);
				prime = false;
				break; // we need this so if is finds number it will stop looking 
				
			} else {
				System.out.println(number + " is not divisable by " + i);
			}	
		}
	}
		
		System.out.println("---------------");
		System.out.println(number + " is prime? " + prime);
		
		
	}
	
}
