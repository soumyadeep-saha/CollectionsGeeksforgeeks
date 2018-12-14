package com.soumyadeep.collections.abstractCollection;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class GFG {

	public static void main(String[] args) {

		// Create an empty collection
		AbstractCollection<Object> abs = new ArrayList<Object>();

		// Use add() method to add
		// elements in the collection
		abs.add("Welcome");
		abs.add("To");
		abs.add("Geeks");
		abs.add("4");
		abs.add("Geeks");

		// Displaying the Collection
		System.out.println("AbstractCollection: " + abs);
	}

}
