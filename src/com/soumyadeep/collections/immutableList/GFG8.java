package com.soumyadeep.collections.immutableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GFG8 {

	public static void main(String[] args) {

		// Java program to demonstrate that a List created using 
		// Collections.unmodifiableList() can be modified indirectly. 
		List<String> list = new ArrayList<>();
		list.add("Geeks");

		// Create ImmutableList from List using copyOf()
		List<String> iList = Collections.unmodifiableList(list);

		// We change List and the changes reflect in iList.
		list.add("For");
		list.add("Geeks");

		System.out.println(iList);
	}
}
