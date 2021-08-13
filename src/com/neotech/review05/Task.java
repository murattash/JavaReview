package com.neotech.review05;

public class Task {
	
	public static void main(String[] args) {
		
			int [] array = {4, 5, 6, 3, 7};
		
			//Task sum = new Task();
		//int answer = sum.sum(array);	
		//System.out.println("The sum of all numbers in array is " + answer);
			
			Task average = new Task();
			
			double answer = average.avr(array);
			
		System.out.println("The average of all numbers is " + answer);
		
	}

	
	double avr (int[] arr) {
		
		int sum = 0;
		double average = 0;
		
		for (int el : arr) {
			
			sum +=el;
		
			average = sum/arr.length;
		}
		
		return average;
	}
	
	
	
	
	
}
