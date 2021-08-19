package com.neotech.review10;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TurkishSpanishDictionary {
	
	public static void main(String[] args) {
		
		Map<String,String> dictonary = new TreeMap<>();
		dictonary.put("ev", "casa");
		dictonary.put("kedi", "geto");
		dictonary.put("esek", "burro");
		dictonary.put("bayrak", "bandera");
		dictonary.put("carsaf", "bandera");
		
		System.out.println(dictonary); //inside the map > {}

		//Set -> No duplicates 
		//List -> Insertion order is preserved
		Set<String> turkishWords = dictonary.keySet();
		System.out.println("Keys -> " + turkishWords);
		
		
		Collection<String> spanishWords = dictonary.values();
		System.out.println("Values -> " + spanishWords);
		
		
		Set<Entry<String, String>> entries = dictonary.entrySet();
		System.out.println("Entries -> " + entries); //inside the set > []
		
		
		System.out.println("------------------------");
		// enhanced/advanced/for-each loop 
		for(Entry<String, String> pair : entries) { //pair is an object type of Entry 
			String key = pair.getKey();
			String value = pair.getValue();
			System.out.println(key + " > "+ value);
		}
		
	}

}
