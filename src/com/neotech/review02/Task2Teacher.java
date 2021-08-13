package com.neotech.review02;

import java.util.Scanner;

public class Task2Teacher {
	
	public static void main(String[] args) {
		
		//ask the user to enter a positive number and it to the total
		//he should enter -1 to stop. -1 will not be added to the total
		
		Scanner input = new Scanner (System.in);
		
		int number = 0;
		int total = 0;
//		
//		System.out.println("Enter a positive number! To stop enter -1");
//		number = input.nextInt();
//		
//		while (number != -1) {
//			total +=number;
//			System.out.println("Enter a positive number! To stop enter -1");
//			number = input.nextInt();
//		}
//		
//		System.out.println("Total = " + total);
	
//		System.out.println("-------------------------------");
//		do {
//			
//			System.out.println("Enter a positive number! To stop enter -1");
//			number = input.nextInt();
//			if (number != -1) {	
//				total +=number;
//			}
//		
//		} while (number != -1);
//		
//		System.out.println("Total = " + total);

//		System.out.println("-------------------------------");
		
//		System.out.println("Enter a positive number! To stop enter -1");
//		number = input.nextInt();
//		
//		for (;number != -1;) 
//			
//		{   total +=number;
//			System.out.println("Enter a positive number! To stop enter -1");
//			number = input.nextInt();
//		}
//		System.out.println("Total = " + total);
		
		
		int a = 1;
		for (; a<3; a++) {      	// this will still work even though you didn't put int in for brackets. You declared it already.
			System.out.println(a);
			
		}
		
		
		
	}

}
