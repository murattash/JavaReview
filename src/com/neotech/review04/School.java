package com.neotech.review04;

public class School {
	public static void main(String[] args) {
		
		Class student1 = new Class();
		
		student1.name = "Anvar";
		student1.gradeLevel = 9;
		student1.studentNr = 1;
		
		student1.study();
		
		Class student2 = new Class();
		
		student2.name = "Alla";
		student2.gradeLevel = 9;
		student2.studentNr = 2;
		
		student2.sleep();
		
		
		Teacher teacher1 = new Teacher();
		
		teacher1.name = "Jonna";
		teacher1.salary= 200.500;
		teacher1.subject = "Math";
		
	}

}
