package com.neotech.review05;

public class ArrayManipulation {

		public static void main(String[] args) {
			
			int[] array = {5, 2, 7, 1, 9, 6};
			
			System.out.println("The initial values of the array");
			for (int i : array) {
				System.out.print(i + " ");
			}
			
			
			ArrayManipulation manip = new ArrayManipulation();
			int result = manip.largest(array); //I am passing array as an argument 
			
			
			System.out.println("\nThe largest element in the array is " + result);
			
		}
	
		int largest (int[] arr) {
			
			int largest = arr[0];
			
			for (int el : arr) {
				if (el > largest) {
					largest = el;
				}
			}
			
			return largest;
			
		}
		
		
}
