package com.neotech.review04;

public class Methods {

	void sayWelcome() {
		for (int i = 0; i < 3; i++) {
			System.out.print("Welcome");
		}
		System.out.println();
	}

	void sayWelcomeWithNumber(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
		
		
	}
	
	void sayGreeting(String greeting) {
			for (int i = 0; i > 3; i++)
				System.out.println(greeting + " ");
	}
	
	void sayGreetingWithNumber(String greeting, int numbers) {
			for (int i = 0; i < numbers; i++) {
				System.out.print(greeting + " ");
			}
		
	}

	public static void main(String[] args) {
		Methods m = new Methods();
		m.sayWelcome();
		m.sayWelcomeWithNumber(6);
		m.sayGreeting("Hush Omadi");
		m.sayGreetingWithNumber("Privet", 7);
		
	}

}
