package com.neotech.review08.Interface;

public class FuitDemo {
	
	public static void main(String[] args) {
		
		Apple a1 = new Apple ("Yellow");
		a1.wash();
		a1.peel();
		
		Coconut c1 = new Coconut ("Brown");
		c1.Crack();
		
		System.out.println("-------Up-Casting-------");
		
		Fruit a2 = new Apple ("Red");
		
		if (a2 instanceof Apple) {
			Apple apple = (Apple) a2;
			apple.wash();
			apple.peel();
		} else if (a2 instanceof Coconut) {
			// you can safely downcast it to Cocnut
			Coconut coco = (Coconut) a2;
			coco.Crack();
		}
		
		//Task
		
		Orange o = new Orange ("Orange");
		o.peel();
		
		
		
	}

}
