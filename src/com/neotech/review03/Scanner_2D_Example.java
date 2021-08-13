package com.neotech.review03;

import java.util.Scanner;

public class Scanner_2D_Example {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("How many rows do you want in the array?");
		int row = input.nextInt();
		
		System.out.println("How many columns do you want in the array?");
		int col = input.nextInt();
		
		//create the array 
		String [][] names = new String [row][col];
		
		//fill the array
		for (int i = 0; i <row; i++)
		{
			for (int j = 0; j< col; j++)
			{
				System.out.println("Please enter the name");
				names[i][j] = input.next();
				
			}
		}
		
		System.out.println("--------------");
		
		//Print the array
		for (String[] rows : names)
		{
			for (String name : rows)
			{
				System.out.print(name + " ");
			}
			System.out.println();
		}	
		
		
		
	}

}
