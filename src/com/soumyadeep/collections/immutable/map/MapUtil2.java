package com.soumyadeep.collections.immutable.map;

import com.google.common.collect.ImmutableMap; 

public class MapUtil2 {

	// New ImmutableMap using of() function from Guava
	public static void createImmutableMap() {
		// Create ImmutableMap using of()
		ImmutableMap<Integer, String> immutableMap = ImmutableMap.of(1, "Geeks", 2, "For", 3, "Geeks");

		// Print the ImmutableMap
		System.out.println(immutableMap);
	}

	public static void main(String[] args) {
		createImmutableMap();
	}
}
