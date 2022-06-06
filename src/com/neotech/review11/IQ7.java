package com.neotech.review11;

import java.util.Arrays;

public class IQ7 {
	
	//Write a java program to find the second largest number in the array? Maximum and minimum number in the array?

	
	public static void main(String[] args) {
		
		int[] number = {24, 1, 564, 23, 67, 19, 602, 43};
		
		//1st way, using Arrays.sort();
		//This method will sort the array
		Arrays.sort(number);
		
		
		//The smallest number is the first element in the array
		System.out.println("The smallerst number is -> " + number[0]);
	
		//The biggest number is the last element in the array
		System.out.println("The smallerst number is -> " + number[number.length - 1]);

		//The second biggest number is the last element in the array
		System.out.println("The smallerst number is -> " + number[number.length - 2]);

		
		System.out.println("-----------------------------------");
		
		//2nd way, without sorting
		
		int[] number2 = {24, 1, 564, 23, 67, 19, 602, 43};
		
		int biggest = number2[0];
		int biggest2 = number2[0];
		int smallest = number2[0];
		
		for (int i = 0; i < number2.length; i++) {
			int element = number2[i];
				
			if (element > biggest) {
				//we found a bigger number
				biggest2 = biggest;
				biggest = element;	
				
			} else if (element > biggest2) {
				biggest2 = element;
				
			}
			
			if (element < smallest) {
				smallest = element;
			}
			
		}
		
	}
	
}
