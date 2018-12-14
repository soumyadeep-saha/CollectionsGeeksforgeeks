package com.soumyadeep.collections.immutableList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GFG1 {

	// Function to create ImmutableList from List
	public static <T> void iList(List<T> list) {
		// Create ImmutableMap from Map using copyOf()
		ImmutableList<T> immutableList = ImmutableList.copyOf(list);

		// Print the ImmutableMap
		System.out.println(immutableList);
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Geeks", "For", "Geeks"));

		iList(list);

	}

}
