package com.soumyadeep.collections.merge2sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class GfG3 {

	// Java program to demonstrate
	// merging of two sets in Java
	// using stream
	// Function merging two sets using addAll()
	public static <T> Set<T> mergeSet(Set<T> a, Set<T> b) {

		// Creating a set with 'a'
		Set<T> mergedSet = a.stream().collect(Collectors.toSet());

		// add the second set to be merged
		mergedSet.addAll(b);

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
