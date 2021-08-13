package com.neotech.review06;

public class HospitalApplication {
	
	public static void main(String[] args) {
		
		Doctor d1 = new Doctor("John", 120000, "D1234");
		d1.checkUp("Burak");
	
		
		Dermatologist d2 = new Dermatologist();
		d2.name = "Okan";
		d2.salary = 200000;
		d2.licenseID = "D789";
		d2.dermID = "XYZ";
		
		d2.checkUp("Eric");
		d2.applySkinTreatment();
		
		System.out.println("------------------");
		// creating a Dermatologist with initial information
		Dermatologist d3 = new Dermatologist("Hakan", 185000, "D007");
		d3.applySkinTreatment();
		
		
		System.out.println("------------------");
		// creating a Dermatologist with four parameters 
		Dermatologist d4 = new Dermatologist("Hakan", 300000, "D297", "pFG");
		d3.applySkinTreatment();
		
	}

}
