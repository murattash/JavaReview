package com.neotech.review06;

public class Forest {

	public static void main(String[] args) {
		
		Wolf a = new Wolf();
		a.name = "Jack";
		a.legs = 4;
		a.displayInfo();
		
		Fox b = new Fox();
		b.name = "Roxy";
		b.legs = 4;
		b.furColor = "Yellow";
		b.displayInfo();
		
		Bear c = new Bear();
		c.name = "Johnny";
		c.legs = 4;
		c.displayInfo();
		c.roar();
		
	}

	
	
}
