package com.neotech.review08.Interface;

public class Orange extends Fruit implements Peelable {

	public Orange(String color) {
		super(color);	
	}

	@Override
	public void peel() {
		System.out.println("Peeling orange");
	}

}
