package com.neotech.review03;

public class TwoD_ArrayIntro {

	public static void main(String[] args) {

		//to format code MAC > cmd + shift + f
		int[][] numbers = new int[3][4]; // [row[[columns]

		numbers[1][2] = 13;
		numbers[2][1] = 17;
		numbers[0][0] = 10;
		numbers[2][0] = 11;

		
		//numbers [3][1] = 2; //run time error
		
		int rows = numbers.length; //numbers tows
		System.out.println("The number of rows -> " + rows);
		
		
		//the length of row with index 1
		int cols = numbers[1].length;
		System.out.println("The number of columns in the row with index 1 -> " + cols);
		
		for (int row = 0; row < numbers.length; row++)
		{
			System.out.println("Row " + row + " ->");
			
			for (int col = 0; col < numbers[row].length; col++)
			{
				System.out.print(numbers[row][col] +  " ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
