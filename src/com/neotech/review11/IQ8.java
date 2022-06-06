package com.neotech.review11;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class IQ8 {

	// How can you remove all duplicates from ArrayList?

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Murat");
		names.add("Flori");
		names.add("Komron");
		names.add("Hakan");
		names.add("Murat");
		names.add("Flori");

		Set<String> set = new LinkedHashSet<>(names);

		// This will remove all elements from the list
		names.clear();

		// This will add all element from the set to the list
		names.addAll(set);

		System.out.println(names);

		// 2nd way, create a new empty list and add all elements one by one
		// before adding check if the new list already contains the element
		List<String> list2 = new ArrayList<>();
		list2.add("Murat");
		list2.add("Flori");
		list2.add("Komron");
		list2.add("Hakan");
		list2.add("Murat");
		list2.add("Flori");

		List<String> list3 = new ArrayList<>();
		for (String el : list2) {
			// ad the element if it is not already in the list
			if (!list3.contains(el)) {
				list3.add(el);
			}

		}

		
		System.out.println(list3);
		
	}

}
