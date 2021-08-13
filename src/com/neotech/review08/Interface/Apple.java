package com.neotech.review08.Interface;

public class Apple extends Fruit implements Peelable, Washable {

	public Apple(String color) {
		super(color);
	}

	@Override
	public void peel() {
		System.out.println("peeling the apple");
	}

	@Override
	public void wash() {
		System.out.println("washing apple");
	}
	

}
