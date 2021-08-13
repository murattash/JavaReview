package com.neotech.review03;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ScannerArray {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("How many numbers do you want to store in the array?");
		int size = input.nextInt();
		
		
		//Declare the array 
		int[] array = new int [size];
		
		
		
		
		//Read numbers and enter them into the array 
		for (int i = 0; i < size; i++)
		{
			System.out.println("Eneter a number: ");
			array[i] = input.nextInt();
		}
		
		
		
		//Printing the array 
		System.out.println("Lets print the number from the array");
		for (int i = 0; i < size; i++)
		{
			System.out.print(array[i] + ", ");
		}
		
		System.out.println();
		System.out.println();
		
		
		
		//Calculate sum
		System.out.println("Let's print the sum of the numebrs in the array ");
		int sum = 0;
		
		for (int element : array)
		{
			sum += element;
			
		}
		
		System.out.println(sum);
	}

}
