package com.neotech.review01;

import java.util.Scanner;

public class LogicalOperatorRichBoy {
	
	public static void main(String[] args) {
		
		//if you are a boy 
		//if you aer rich - buy a ferrari 
		//otherwise - play soccer 
		
		//if you are a girl
		//if you are rich - buy a lv bag
		//otherwise - read a book
		
		//if you are non
		//invalid data
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Are you a boy or a girl?");
		String gender = scan.next();
		
		System.out.println("Are you rich? True or False");
		boolean rich = scan.nextBoolean();
		
		if (gender.equals("boy") && rich) {
			
			System.out.println("Buy a Ferrari");
			
		} else if (gender.equals("boy") && !rich) {
			
			System.out.println("Play soccer");
			
		} else if (gender.equals("girl") && rich) {
			
			System.out.println("Buy an LV Bag");
			
		} else if (gender.equals("girl") && !rich) {
			
			System.out.println("Read a book");
			
		} else { 
			
			System.out.println("Invalid choice");
		}
			
		
		
	}

}
