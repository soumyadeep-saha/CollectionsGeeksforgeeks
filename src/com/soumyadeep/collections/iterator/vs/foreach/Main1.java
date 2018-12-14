package com.soumyadeep.collections.iterator.vs.foreach;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {

		// Java program to demonstrate working of nested iterators 
		// may not work as expected and throw exception.
		// Create a link list which stores integer elements
		List<Integer> l = new LinkedList<Integer>();

		// Now add elements to the Link List
		l.add(2);
		l.add(3);
		l.add(4);

		// Make another Link List which stores integer elements
		List<Integer> s = new LinkedList<Integer>();
		s.add(7);
		s.add(8);
		s.add(9);

		// Iterator to iterate over a Link List
		for (Iterator<Integer> itr1 = l.iterator(); itr1.hasNext();) {
			for (Iterator<Integer> itr2 = s.iterator(); itr2.hasNext();) {
				if (itr1.next() < itr2.next()) {
					System.out.println(itr1.next());
				}
			}
		}
	}

}
