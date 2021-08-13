package com.neotech.review01;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		// byte < short < int < long < float < double 
		
		int intNumber = 24;
		
		// Widening/implicitly/automatically 
		
		double d = intNumber;
		
		System.out.println("The intNumber is " + intNumber);
		System.out.println("The doubleNumber is " + d);
		
		
		
		// Narrowing/explicit/manually you need to specify data type in the ()
		
		byte byteNumber = (byte) intNumber;
		System.out.println("The byteNumber is " + byteNumber);
		
		
		intNumber = 2400;
		byteNumber = (byte) intNumber;
		System.out.println("The byteNumber is " + byteNumber);
		
		
		
	}

}
