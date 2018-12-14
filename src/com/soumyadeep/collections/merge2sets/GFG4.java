package com.soumyadeep.collections.merge2sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class GFG4 {

	// Java program to merge two arrays of
	// same type into an Object array.
	// Function merging two sets using addAll()
	public static Set<Integer> mergeSet(Set<Integer> a, Set<Integer> b) {

		// Creating an empty set
		Set<Integer> mergedSet = new HashSet<>();

		// add the two sets to be merged
		// into the new set
		Collections.addAll(mergedSet, a.toArray(new Integer[0]));
		Collections.addAll(mergedSet, b.toArray(new Integer[0]));

		// returning the merged set
		return mergedSet;
	}

	public static void main(String[] args) {

		// Creating the sets to be merged
		// First set
		Set<Integer> a = new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] { 1, 3, 5, 7, 9 }));

		// Second set
		Set<Integer> b = new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] { 0, 2, 4, 6, 8 }));

		// Printing the sets
		System.out.println("Set a: " + a);
		System.out.println("Set b: " + b);

		// calling mergeSets()
		System.out.println("Merged Set: " + mergeSet(a, b));
	}

}
