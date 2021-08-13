package com.neotech.review02;

public class SumEvenForLoop {
	
		public static void main(String[] args) {
			
			//add even numbers
			//add odd numbers
			//add all numbers
			//between 1 && 50
			//using for loop
			
//			int sumEven = 0;
//			int sumOdd = 0;
//			int sumAll = 0;
//			
//			for (int i = 1; i <=50; i++)    /// I did this one, below is teacher vesrion 
//			{
//				if (i % 2 == 0)	
//				{sumEven = sumEven + i;}
//				if (i % 2 == 1)
//				{sumOdd = sumOdd + i;}
//			}
//			System.out.println("sumEven is " + sumEven);
//			System.out.println("sumEven is " + sumOdd);
//			System.out.println("Total is " + (sumEven + sumOdd));
//	
			
			
			int sumOdd = 0;
			int sumEven = 0;
			int total = 0;
			
			for (int num = 1; num <=50; num++) {
				
				if (num % 2 == 0) {
					
					sumEven += num;
				}else {
					
					sumOdd +=num;
				}
				
				total += num;
			}
			
			
			System.out.println("The sum of even number is " + sumEven);
			System.out.println("The sum of odd number is " + sumOdd);
			System.out.println("The sum of all numbers is " + total);
		}

}
