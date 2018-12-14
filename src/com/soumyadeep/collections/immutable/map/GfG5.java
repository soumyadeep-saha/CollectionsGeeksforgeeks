package com.soumyadeep.collections.immutable.map;

import java.util.Map;

public class GfG5 {

	public static void main(String[] args) {

		// empty immutable map
		Map<Integer, String> map = Map.of();

		// Lets try adding element in these set
		map.put(1, "Geeks");
		map.put(2, "For");
		map.put(3, "Geeks");
	}
}
