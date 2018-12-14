package com.soumyadeep.collections.treeSet;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {

		// Java program to demonstrate insertions in TreeSet 
		TreeSet<String> ts1 = new TreeSet<String>();

		// Elements are added using add() method
		ts1.add("A");
		ts1.add("B");
		ts1.add("C");

		// Duplicates will not get insert
		ts1.add("C");

		// Elements get stored in default natural
		// Sorting Order(Ascending)
		System.out.println(ts1);
	}

}
