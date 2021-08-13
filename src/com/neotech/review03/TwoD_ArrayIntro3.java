package com.neotech.review03;

public class TwoD_ArrayIntro3 {

	public static void main(String[] args) {

		int[][] nums = { { 8 }, 
						 { 9, 5, 2 }, 
						 { 6, 4 } };

		System.out.println(nums[2][1]);
		
		System.out.println(nums[1].length); //length of row 1
		
		System.out.println(nums.length); //total rows
		
		System.out.println(nums[0].length);
		
		
		System.out.println("-----------------------");
		
		for (int row = 0; row < nums.length; row++)
		{
			for (int col = 0; col < nums[row].length; col++)
			{
				System.out.print(nums[row][col] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------");
		
		
		for (int [] row : nums)
		
		{
			for (int element : row)
			{
				System.out.print(element + " ");
			}
			
			System.out.println();
		}
		
	}

}
