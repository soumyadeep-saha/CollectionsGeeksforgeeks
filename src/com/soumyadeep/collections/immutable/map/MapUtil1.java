package com.soumyadeep.collections.immutable.map;

import java.util.HashMap;
import java.util.Map;
import com.google.common.collect.ImmutableMap; 

public class MapUtil1 {

	// From existing Map using copyOf() function of Guava
	// Function to create ImmutableMap from Map
	public static <K, T> void iMap(Map<K, T> map) {
		// Create ImmutableMap from Map using copyOf()
		ImmutableMap<K, T> immutableMap = ImmutableMap.copyOf(map);

		// Print the ImmutableMap
		System.out.println(immutableMap);
	}

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Geeks");
		map.put(2, "For");
		map.put(3, "Geeks");
		iMap(map);

	}

}
