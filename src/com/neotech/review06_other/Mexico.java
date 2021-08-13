package com.neotech.review06_other;

import com.neotech.review06.USA;

public class Mexico {
	
	public static void main(String[] args) {
		
			USA us = new USA();
			
			System.out.println("Accessing the variables from inside the USA");
			// private, protected and default variables cannot be accessed from outside the package
		//	System.out.println("private -->" + us.capitalCity);
		//	System.out.println("protected -->" + us.mainState); to access this you need to create an object with Mexico
		//	System.out.println("default -->" + us.normalState);
			System.out.println("public --> " + us.bestSchool);
		
			System.out.println();
			
			System.out.println("Accessing the mothods from inside the USA");
			//us.seletecPresident();	
			//playNBA();
			us.speakEnglish();
			
			
	}

}
