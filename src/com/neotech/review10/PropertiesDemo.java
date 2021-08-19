package com.neotech.review10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws IOException {
		
		String projectPath = System.getProperty("user.dir");
		
		String filePath = projectPath + "/extra/demo.properties";
		
		FileInputStream fileIS = new FileInputStream(filePath);
		
		Properties proper = new Properties();
		
		proper.load(fileIS);
		
		System.out.println(proper);
		
		//1st way 
		Object lastName = proper.get("LastName");
		System.out.println(lastName);
		
		//2nd way > we use this 
		String firstName = proper.getProperty("FirstName");
		System.out.println(firstName);
		
		String age = proper.getProperty("Age");
		System.out.println(age);
		
		//add more key->value pairs
		proper.setProperty("StudentNumber", "N123");
		System.out.println(proper);
		
		//Or I can re-assign values
		proper.setProperty("Age", "25");
		System.out.println(proper);
		
		
		
		//Now let us save into a new file
		String newPath = projectPath + "/extra/NewFile.txt";
		FileOutputStream fileOS = new FileOutputStream(newPath);
		proper.store(fileOS, "Evis asked for the comment");
		
		
		
		
		
	}

}
