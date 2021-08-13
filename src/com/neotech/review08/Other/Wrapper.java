package com.neotech.review08.Other;

public class Wrapper {
	
	public static void main(String[] args) {
		
		int int1 = 9;		
		Integer integer1 = new Integer(int1);// Boxing/Wrapping
		int int2 = integer1.intValue(); //unBoxing/unWrapping
		
		
		
		//Easy way
		int int3 = 7;
		
		Integer integer2 = int3; //Auto-Boxing, Auto-Wrapping, Auto-converting 
		
		int int4 = integer2; //Auto-Boxing, Auto-Wrapping, Auto-converting 
		
		
		
		//Boolean wrapper
		Boolean b1 = false; //Auto-Boxing
	
		
		
		//Double wrapper
		Double d1 = 4.2; //Auto-Boxing
		
		/*
		 * int > Integer
		 * short > Short
		 * byte > Byte
		 * long > Long
		 * float > Float
		 * double > Double
		 * boolean > Boolean 
		 * char > Character
		 * 
		 */
	}

}
