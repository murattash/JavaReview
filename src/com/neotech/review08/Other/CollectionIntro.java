package com.neotech.review08.Other;

import java.util.ArrayList;

public class CollectionIntro {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		boolean isEmp = numbers.isEmpty();
		System.out.println(isEmp);
		
		//long way
		numbers.add(new Integer(7));
		
		//easy way
		numbers.add(5);
		numbers.add(8);
		numbers.add(1, 10); //adding a number at index 1
		
		
		isEmp = numbers.isEmpty();
		System.out.println(isEmp);
		
		System.out.println("Size is: " + numbers.size());
		
		
		System.out.println("How can I iterate the ArrayList?");
		System.out.println("----1st way, Normal for loop------");
		
		for (int i = 0; i < numbers.size(); i++) {
			Integer num = numbers.get(i);
			System.out.print(num);
		}
		
		System.out.println("\n" + "----2st way, Advanced for loop------");
		
		for (Integer elements : numbers) {
			System.out.print(elements);

		}
		
		
	}

}
