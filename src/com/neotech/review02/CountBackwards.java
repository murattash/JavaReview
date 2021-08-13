package com.neotech.review02;

public class CountBackwards {
	
	public static void main(String[] args) {
		
		//4321
		//4321
		//4321
		//4321
		
		
		for (int row = 1; row <=4; row++) { //does not matter if you start at 104 and finish at 108 
			
			for (int col = 4; col >= 1; col--) {  //here it does matter because we are using col to print 
				
				System.out.print(col);
				
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		//4444
		//3333
		//2222
		//1111
		
		for (int row = 4; row >=1; row--) {
			for (int col = 1; col <=4; col++) {
				System.out.print(row);
				
				
			}
			System.out.println();
			
			
		}
		
		//4444
		//333
		//22
		//1
		
		System.out.println("-----------------------");
		
		for (int row = 4; row >=1; row--) {
			
			for (int col = 1; col <= row; col++) {
				
				System.out.print(row);
				
			}
			System.out.println();
		
		}
		
		
		
	}

}
