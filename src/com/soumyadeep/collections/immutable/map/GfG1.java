package com.soumyadeep.collections.immutable.map;

import java.util.Map;
import com.google.common.collect.ImmutableMap; 

public class GfG1 {

	// Using Java 9 Factory Of() method
	public static void main(String args[]) {
		// non-empty immutable set
		Map<Integer, String> map = Map.of(1, "Geeks", 2, "For", 3, "Geeks");

		// Let's print the set
		System.out.println(map);
	}

}
