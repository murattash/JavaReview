package com.neotech.review08.Other;

public class PhoneDemo {
	
	public static void main(String[] args) {
		
		Phone p1 = new Phone("HQ123", "Apple", "Alb123");
		
		String serialNumber = p1.getSerialNr("Flori123");
		System.out.println(serialNumber);
		
		serialNumber = p1.getSerialNr("Alb123");
		System.out.println(serialNumber);
		
		System.out.println("----Let me try to change the Serial Number");
		p1.getSerialNr("Komron12345");
		
		serialNumber = p1.getSerialNr("Alb123");
		System.out.println(serialNumber);
		
		
		p1.setSerialNr("K1234");
		System.out.println(p1.getSerialNr("Alb123"));

		
		
		
		
	}

}
