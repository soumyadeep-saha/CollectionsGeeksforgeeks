package com.soumyadeep.collections.listInterface;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {

		// Java program to demonstrate search
		// operations on List interface
		// Type safe array list, stores only string
		List<String> l = new ArrayList<String>(5);
		l.add("Geeks");
		l.add("for");
		l.add("Geeks");

		// Using indexOf() and lastIndexOf()
		System.out.println("first index of Geeks:" + l.indexOf("Geeks"));
		System.out.println("last index of Geeks:" + l.lastIndexOf("Geeks"));
		System.out.println("Index of element" + " not present : " + l.indexOf("Hello"));
	}

}
