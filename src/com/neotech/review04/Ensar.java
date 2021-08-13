package com.neotech.review04;

public class Ensar {
	
	//A method with TWO parameters and NO return type
	void addTwoNumbers() {
		System.out.println("I am inside addTwoNumbers");
		int result = 3 + 4;
	}

	//A method with TWO parameters and NO return type
	void addTwoNumbersThatIGive (int num1, int num2) {
		System.out.println("I am inside addTwoNumbersThatIGive");
		int result = num1 + num2;
		
	}
	
	
	//A method with TWO parameters and WITH return type
	int addTwoNumbersAndGiveMeTheResult() {
		int result = 5 + 2;
		return result;
	}
	
	//A method with TWO parameters and WITH return type
	int addNumbersThatIGiveAndGiveMetTheResul (int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
}
