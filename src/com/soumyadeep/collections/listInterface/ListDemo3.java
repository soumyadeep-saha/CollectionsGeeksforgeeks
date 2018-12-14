package com.soumyadeep.collections.listInterface;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {

	public static void main(String[] args) {

		// Java program to demonstrate subList operation
		// on List interface.
		// Type safe array list, stores only string
		List<String> l = new ArrayList<String>(5);

		l.add("GeeksforGeeks");
		l.add("Practice");
		l.add("GeeksQuiz");
		l.add("IDE");
		l.add("Courses");

		List<String> range = new ArrayList<String>();

		// Return List between 2nd(including)
		// and 4th element(excluding)
		range = l.subList(2, 4);

		System.out.println(range);
	}

}
