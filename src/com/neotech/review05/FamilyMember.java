package com.neotech.review05;

public class FamilyMember {
	
	String firstName; //instance variable belong to the instance/object
	static String lastName; //static/class variable, belongs to the class
	int age; ////instance variable belong to the instance/object
	
	
	void printFullName(){
		
		System.out.println("Full name is " + firstName + " " + lastName);
		
	}
	
	
	
	static void printFamilyName() {
		
		//System.out.println("Full name is " + firstName + " " + lastName);
		System.out.println("Full name is " + lastName);
		
	}
	
}
