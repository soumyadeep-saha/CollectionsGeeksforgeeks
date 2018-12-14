package com.soumyadeep.collections.immutable.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GFG6 {

	public static void main(String[] args) {

		// Java program to demonstrate that a Map created using
		// Collections.unmodifiableMap() can be modified indirectly.
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Geeks");
		map.put(2, "For");
		map.put(3, "Geeks");

		// Create ImmutableMap from Map using copyOf()
		Map<Integer, String> imap = Collections.unmodifiableMap(map);

		// We change map and the changes reflect in imap.
		map.put(4, "Computer");
		map.put(5, "Portal");

		System.out.println(imap);
	}

}
