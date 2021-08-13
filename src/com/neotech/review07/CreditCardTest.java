package com.neotech.review07;

public class CreditCardTest {
	
	public static void main(String[] args) {
		
		CreditCard cc1 = new CreditCard(12000);
		cc1.calInterest();
		
		CreditCard cc2 = new Visa(12000);
		cc2.calInterest();
		
		CreditCard cc3 = new AX(12000);
		cc3.calInterest();
	}
	

}
