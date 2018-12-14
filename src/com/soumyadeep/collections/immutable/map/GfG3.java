package com.soumyadeep.collections.immutable.map;

import java.util.Map;

public class GfG3 {

	public static void main(String[] args) {
		// Creating an ImmutableMap from existing Map
		// non-empty immutable set
		Map<Integer, String> map = Map.of(1, "Geeks", 2, "For", 3, "Geeks");
		ImmutableMap<Integer, String> imap = ImmutableMap.<Integer, String>builder().putAll(map).build();

		// Let's print the set
		System.out.println(imap);
	}

}
