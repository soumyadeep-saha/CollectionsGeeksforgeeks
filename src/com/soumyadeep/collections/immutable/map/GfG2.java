package com.soumyadeep.collections.immutable.map;

import com.google.common.collect.ImmutableMap;

public class GfG2 {

	public static void main(String[] args) {

		// Using Builder() from ImmutableMap
		// non-empty immutable set
		ImmutableMap<Integer, String> imap = ImmutableMap.<Integer, String>builder().put(1, "Geeks").put(2, "For")
				.put(3, "Geeks").build();

		// Let's print the set
		System.out.println(imap);

	}

}
