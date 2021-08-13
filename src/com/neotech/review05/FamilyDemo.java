package com.neotech.review05;

public class FamilyDemo {
	
	public static void main(String[] args) {
		//I CANNOT access instance variables before I create an object
		//FamilyMember.firstName = "Lebron";
		
		//I CAN access class variables before I create an object 
		FamilyMember.lastName = "James";
		
		//I CANNOT access non-static method before I create an object 
		// FamilyMember.printFullName();
		
		//I CAN access static method before I create an object 
		FamilyMember.printFamilyName();
		
		
		FamilyMember member1 = new FamilyMember();
		member1.firstName = "Lebron";
		member1.age = 35;
		
		FamilyMember member2 = new FamilyMember();
		member2.firstName = "Savannah";
		member2.age = 34;
		
		System.out.println("They went to court and changed their lastname");
		FamilyMember.lastName = "Babakhanzoda";
		
		
		member1.printFullName();
		member2.printFullName();
	}

}
