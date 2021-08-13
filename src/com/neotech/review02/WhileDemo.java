package com.neotech.review02;

public class WhileDemo {
	
	public static void main(String[] args) {
		
		String greeting = "Salom";
		
		int count = 1;
		
		while (count <= 5)
		{
			System.out.println(greeting);	
			count++;
		}
			
		System.out.println("---------------------");	
		
		int i = 1;
		while (true) {
			
			// System.out.println(greeting); - do not put it here because it will print it 3 times instead of 2
			// with a break
			
			if (i >= 3) {		
				break;
			}	
			System.out.println(greeting);
			i++;			
		}
		
		System.out.println("---------------------");	
		
		
	}

}
