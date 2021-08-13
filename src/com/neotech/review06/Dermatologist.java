package com.neotech.review06;

//Doctor is the parent/base/super class
//Dermatologist is the child/derived/sub class
public class Dermatologist extends Doctor {
	
	String dermID;
	
	public Dermatologist() {
	//super()
	//implicitly it is calling the default constructor of the parent class
	}
	
	//The constructors are NOT inherited 
	Dermatologist (String name, int salary, String licenseID){
		super(name, salary, licenseID);
	}
	
	Dermatologist (String name, int salary, String licenseID, String dermID){
		//first way
		//this(name, salary, licenseID);
		//second way
		super(name, salary, licenseID);
		
		this.dermID = dermID;
	}
	
	
	public void applySkinTreatment() {
		System.out.println("Doctor " + name + " applies skin treatment");
	}
			
		
		
	}

