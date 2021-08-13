package com.neotech.review06;


//OOP --> Object Oriented Programming
//1. Inheritance 
//2. Polymorphism 
//3. Abstraction
//4. Encapsulation 


// Every class in Java is extending the Object class 
public class Doctor {
	String name;
	int salary;
	String licenseID;
	
	public Doctor() {
		
	}
	
	
	Doctor(String name, int salary, String licenseID) {
		this.name = name;
		this.salary = salary;
		this.licenseID = licenseID;
		
	}

	public void checkUp(String patientName) {
		System.out.println("Doctor " + name + " makes a checkup on " + patientName);
	}
	
}
