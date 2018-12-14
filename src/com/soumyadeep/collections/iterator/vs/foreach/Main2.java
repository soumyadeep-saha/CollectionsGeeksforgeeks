package com.soumyadeep.collections.iterator.vs.foreach;

import java.util.LinkedList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {

		// Java program to demonstrate working of nested for-each 
		// Create a link list which stores integer elements
		List<Integer> l = new LinkedList<Integer>();

		// Now add elements to the Link List
		l.add(2);
		l.add(3);
		l.add(4);

		// Make another Link List which stores integer elements
		List<Integer> s = new LinkedList<Integer>();
		s.add(2);
		s.add(4);
		s.add(5);
		s.add(6);

		// Iterator to iterate over a Link List
		for (int a : l) {
			for (int b : s) {
				if (a < b)
					System.out.print(a + " ");
			}
		}
	}

}
