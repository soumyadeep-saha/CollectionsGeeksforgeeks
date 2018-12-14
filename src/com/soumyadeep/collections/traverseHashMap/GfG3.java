package com.soumyadeep.collections.traverseHashMap;

import java.util.HashMap;

public class GfG3 {

	public static void main(String[] args) {

		// Java program for traversing
		// through a hashmap using for-each loop
		// Consider the hashmap containing
		// student name and their marks
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// Adding mappings to HashMap
		hm.put("GeeksforGeeks", 54);
		hm.put("A computer portal", 80);
		hm.put("For geeks", 82);

		// Printing the HashMap
		System.out.println("Created hashmap is" + hm);

		// Loop through the hashmap
		// and add bonus marks
		System.out.println("HashMap after adding bonus marks:");

		// Using Hashmap.forEach()
		hm.forEach((k, v) -> System.out.println(k + " : " + (v + 10)));
	}

}
