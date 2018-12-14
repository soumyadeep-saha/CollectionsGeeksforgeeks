package com.soumyadeep.collections.immutableList;

import java.util.ArrayList;
import java.util.List;

public class GFG9 {

	// Below is a Java program for 
	// Creating an immutable List using copyOf() 
	// and modifying original List. 
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Geeks");

		// Create ImmutableList from List using copyOf()
		ImmutableList<String> iList = ImmutableList.copyOf(list);

		// We change List and the changes wont reflect in iList.
		list.add("For");
		list.add("Geeks");

		System.out.println(iList);
	}

}
