package com.soumyadeep.collections.immutableList;

public class GfG4 {

	public static void main(String[] args) {
		// Creating a new ImmutableList
		// non-empty immutable set
		ImmutableList<String> iList = ImmutableList.<String>builder().add("Geeks", "For", "Geeks").build();

		// Let's print the List
		System.out.println(iList);
	}

}
