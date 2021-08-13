package com.neotech.review08.Interface;

public class Coconut extends Fruit implements Crackable {

	public Coconut(String color) {
		super(color);
	}

	@Override
	public void Crack() {
			System.out.println("Cracking the coconut");
	}
	
	
		
}
