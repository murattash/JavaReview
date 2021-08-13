package com.neotech.review02;

public class Pyramid {
	
	public static void main(String[] args) {
		
		//*
		//**
		//***
		//****
		
		for (int row = 1; row <=4; row++) {
			
			for (int col = 1; col <= row; col++) { //put ROW because it depends on the row number
				System.out.print("*");
				
			}
			System.out.println(); //Move to the next line 
		}
				
				
	}

}
