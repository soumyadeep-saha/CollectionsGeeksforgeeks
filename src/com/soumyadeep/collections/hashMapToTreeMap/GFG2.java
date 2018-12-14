package com.soumyadeep.collections.hashMapToTreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GFG2 {

	// Java Program to convert
	// HashMap to TreeMap in Java 8
	// Generic function to construct a
	// new TreeMap from HashMap
	public static <K, V> Map<K, V> convertToTreeMap(Map<K, V> hashMap) {
		// Create a new TreeMap
		Map<K, V> treeMap = new TreeMap<>();

		// Pass the hashMap to putAll() method
		treeMap.putAll(hashMap);

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

		// construct a new TreeMap from HashMap
		Map<String, String> treeMap = convertToTreeMap(hashMap);

		// Print the TreeMap
		System.out.println("TreeMap: " + treeMap);

	}

}
