package com.neotech.review03;

public class ArrayIntro {
	
	public static void main(String[] args) {
		
		//funny way
		int a1 = 4;
		int a2 = 7;
		int a3 = 2;
		int a4 = 6;
		
		int sum = a1 + a2 + a3 + a4;
		System.out.println("Sum is -> " + sum);
		
		System.out.println();
		
		//1st serious way
		int[] arr = new int[4];		//in this array you need to add element on by one 
		arr [2] = 2;
		arr [0] = 7;
		arr [1] = 6;
		arr [3] = 4;
		
		int sumArr = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			sumArr +=arr[i];
		}
		System.out.println("The sum of array is " + sumArr);
		
		System.out.println();
		
		
		//2nd serious way 
		
		int[] arr2 = {2, 7, 6, 4}; //use this way if you know values up front. NOTE, you can also put [] after arr2. 
		
		int sumArr2 = 0;
		for (int element : arr2) 
		{
			sumArr2 += element;
			
		}
		
		System.out.println("The sum of array2 is " + sumArr2);
		
		System.out.println();
		
		String[] animals = {"dog", "cat", "mouse", "monkey", "donkey", "horse"};
		
		
		for (int i = 0; i < animals.length; i++)
		{
			System.out.print(animals[i] + " ");
		}
		
		System.out.println();
		
		for (String element : animals)
		{
			System.out.print(element + " ");
		}
		System.out.println();
		
		
		System.out.println();
		System.out.println("Print the animals in reverse order");
		
		
		for (int i = animals.length - 1; i >= 0; i--)
			{
				System.out.print(animals[i] + ", ");
			}
		
		
		
		
		
		
		
		
	}

}
