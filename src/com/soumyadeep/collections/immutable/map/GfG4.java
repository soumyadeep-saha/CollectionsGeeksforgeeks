package com.soumyadeep.collections.immutable.map;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class GfG4 {

	public static void main(String[] args) {

		// Java code illustrating of() method to
		// create a ImmutableSet
		// non-empty immutable set
		Map<Integer, String> map = Map.of(1, "Geeks", 2, "For", 3, "Geeks");
		ImmutableMap<Integer, String> imap = ImmutableMap.<Integer, String>builder().putAll(map).put(4, "Computer")
				.put(5, "Portal").build();

		// Let's print the set
		System.out.println(imap);
	}

}
