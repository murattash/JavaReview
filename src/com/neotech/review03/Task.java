package com.neotech.review03;

public class Task {
	
	public static void main(String[] args) {
		
		//find the largest number
		
		
		int[][] b = { { 2, 3, 5 }, 
					  { 2, 4, 7 }, 
					  { 8, 1, 9 }, 
					  { 3, 5, 1 } };
		
		int larNumber = b[0][0];
		
		for (int row = 0; row < b.length; row++)
		{
			for (int col = 0; col < b[row].length; col++)
			{
				if (larNumber < b[row][col])
				{
					larNumber = b[row][col];
				}
				
				
			}
			
		
		}
		
		System.out.println(larNumber);
		
	}

}
