package com.soumyadeep.collections.hashMapToTreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GFG4 {

	// Java Program to convert
	// HashMap to TreeMap in Java 8
	// Function to construct a new TreeMap from HashMap
	public static Map<Integer, String> convertToTreeMap(Map<String, String> hashMap) {
		// Create a new TreeMap
		Map<Integer, String> treeMap = new TreeMap<>();

		// Convert the HashMap to TreeMap manually
		for (Map.Entry<String, String> e : hashMap.entrySet()) {
			treeMap.put(Integer.parseInt(e.getKey()), e.getValue());
		}

		// Return the TreeMap
		return treeMap;
	}

	public static void main(String args[]) {
		// Create a HashMap
		Map<String, String> hashMap = new HashMap<>();

		// Add entries to the HashMap
		hashMap.put("1", "Geeks");
		hashMap.put("2", "forGeeks");
		hashMap.put("3", "A computer Portal");

		// Print the HashMap
		System.out.println("HashMap: " + hashMap);

		// construct a new TreeMap<Integer, String>
		// from HashMap<String, String>
		Map<Integer, String> treeMap = convertToTreeMap(hashMap);

		// Print the TreeMap
		System.out.println("TreeMap: " + treeMap);
	}

}
