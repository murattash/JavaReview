package com.neotech.review08.Other;

public class Phone {
	
	private String serialNr, brand, password;

	public Phone(String serialNr, String brand, String password) {
		this.serialNr = serialNr;
		this.brand = brand;
		this.password = password;
	}
	
	public String getSerialNr(String password) {
		String result = "";
		
		if (password.equals(this.password)) {
			result = serialNr;
		} else {
			result = "Invalid password";
		}
		
		return result;
	}

	//you will be able to change the serial number 
	//only if it is 5 characters long
	public void setSerialNr(String serialNr) {
		if (serialNr.length() == 5) {
			this.serialNr = serialNr;
		}
	}
	
	
	 
	
}
