package com.soumyadeep.collections.immutable.map;

import java.util.HashMap;
import java.util.Map;
import com.google.common.collect.ImmutableMap; 

public class GFG7 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Geeks");
		map.put(2, "For");
		map.put(3, "Geeks");

		// Create ImmutableMap from Map using copyOf()
		ImmutableMap<Integer, String> imap = ImmutableMap.copyOf(map);

		// We change map and the changes wont reflect in imap.
		map.put(4, "Computer");
		map.put(5, "Portal");

		System.out.println(imap);
	}

}
