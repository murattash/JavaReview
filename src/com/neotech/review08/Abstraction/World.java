package com.neotech.review08.Abstraction;

public class World {
	
	public static void main(String[] args) {
		
		Human h1 = new Albanian("Flori"); //up-casting
		h1.talk();
		h1.sleep();
		//h1.albanianDance(); > we need to downcast 
		
		Albanian a1 = (Albanian) h1; //down-casting 
		
	}

}
