package com.soumyadeep.collections.iterators;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test4 {

	public static void main(String[] args) {

		Vector v = new Vector();

		// Create three iterators
		Enumeration e = v.elements();
		Iterator itr = v.iterator();
		ListIterator ltr = v.listIterator();

		// Print class names of iterators
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(ltr.getClass().getName());
	}
}