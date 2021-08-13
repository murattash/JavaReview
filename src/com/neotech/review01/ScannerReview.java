package com.neotech.review01;

import java.util.Scanner;

public class ScannerReview {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		// 1) .next() reads one word until space
		
		
		// System.out.println("Enter fist name: ");
		// String fName = scan.next();
		
		// System.out.println("Enter last name: ");
		// String lName = scan.next();
		
		// System.out.println("Full name is : " + fName + " " + lName);
		
		
		
		
		// 2) .nextLine() reads the whole line until enter
		
		
//		System.out.println("Enter fist name: ");
//		String fName = scan.nextLine();
//		
//		System.out.println("Enter last name: ");
//		String lName = scan.nextLine();
//		
//		System.out.println("Full name is : " + fName + " " + lName);
//		
		
		// 3) next(), nextInt(), nextDouble(), nextByte()
		// They all read until next space or enter
		
		System.out.println("Please enter an int, boolean and a double");
		int num = scan.nextInt();
		boolean b = scan.nextBoolean();
		double d = scan.nextDouble();
		
		System.out.println("What you entered was " + num + ", " + b + " and " + d);
		
	}


}
