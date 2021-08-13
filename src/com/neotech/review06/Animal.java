package com.neotech.review06;

public class Animal {
	String name;
	int legs;

	public void sleep() {
		System.out.println("All animals sleep");
		
	}
	
	void displayInfo() {
		System.out.println(name + " has " + legs + " legs" );
	}
	
}

class Wolf extends Animal {
	
}

class Fox extends Animal {
	
	String furColor;
	
}

class Bear extends Animal {
	
	void roar() {
		
		System.out.println("Bear is roaring");
	}
}