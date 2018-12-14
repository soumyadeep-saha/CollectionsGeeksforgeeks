package com.soumyadeep.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_example1 {

	public static void main(String[] args) {

		// Java code for adding elements in Set 
		// Set deonstration using HashSet
		Set<String> hash_Set = new HashSet<String>();
		hash_Set.add("Geeks");
		hash_Set.add("For");
		hash_Set.add("Geeks");
		hash_Set.add("Example");
		hash_Set.add("Set");
		System.out.print("Set output without the duplicates");

		System.out.println(hash_Set);

		// Set deonstration using TreeSet
		System.out.print("Sorted Set after passing into TreeSet");
		Set<String> tree_Set = new TreeSet<String>(hash_Set);
		System.out.println(tree_Set);
	}

}
