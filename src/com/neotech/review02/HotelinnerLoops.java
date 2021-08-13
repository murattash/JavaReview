package com.neotech.review02;

public class HotelinnerLoops {
	
	public static void main(String[] args) {
		//4 floors in hotels
		//each floor have 6 rooms
		//room number in floor 1 are 1.1 1.2 1.3 1.4 1.5 1.6
		//room number in floor 2 are 2.1 2.2 2.3 
		//i want to print all the room numbers
		
		
		for (int floor = 1; floor <= 4; floor++) 
			{
			System.out.println("Floor -> " + floor);
			
			for (int room = 1; room <= 6; room++) 
			
			{
				System.out.print(floor + "." + room + " ");
			}
			
			System.out.println(); //Bring me to the next line, so the Floor -> # moves to next line
			}
		
	}

}
