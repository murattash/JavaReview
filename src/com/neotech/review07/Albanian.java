package com.neotech.review07;

public class Albanian extends Human {

	public Albanian() {
		
	}
	
	public Albanian(String name) {
		super(name);
	}
	
	//when overriding the method signature must be the same
	@Override // tell the program that I will be using Override
	public void talk() {
		System.out.println("Une flas shiqip. Une quhem " + name);
	}
	
	public void albanianDance() {
		System.out.println("Dancing valle kosovare!");
	}
	
}
