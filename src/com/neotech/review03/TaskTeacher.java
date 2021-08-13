package com.neotech.review03;

public class TaskTeacher {
	
	public static void main(String[] args) {
		
		int[][] b = { { 2, 3, 5 }, 
				  { 2, 4, 7 }, 
				  { 8, 1, 9 }, 
				  { 3, 5, 1 } };
		
		int biggest = 0;
		
		
		for (int row = 0; row < b.length; row++)
		{
			for (int col = 0; col < b[row].length; col++)
			{
				int element = b[row][col];
				
				if (element > biggest) 
				{ 	//when i find a bigger element
					//i have to update the biggest number
					biggest = element;
				}
				
			}
		}
		
		System.out.println("The biggest number is " + biggest);
		
		
		
		
		
		System.out.println("-------------");
		
		
		int max = b[0][0];
		
		for (int[] row : b)
		{
			for (int element :row)
			{
				if (element > max) 
				{ 
					max = element;
				}
			}
		}
		System.out.println("The max is " + max);
	}


}
