package com.soumyadeep.collections.concurrentLinkedQueue;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeDemo4 {

	public static void main(String[] args) {

		// Create a ConcurrentLinkedDeque
		// using ConcurrentLinkedDeque() contructor
		ConcurrentLinkedDeque<Integer> cld = new ConcurrentLinkedDeque<Integer>();

		cld.addFirst(12);
		cld.addFirst(70);
		cld.addFirst(1009);
		cld.addFirst(475);

		// Displaying the existing LinkedDeque
		System.out.println("ConcurrentLinkedDeque: " + cld);

		// Displaying the Last element
		// using getLast() method
		System.out.println("The Last element is: " + cld.getLast());

		// Displaying the first element
		// using peekFirst() method
		System.out.println("First Element is: " + cld.peekFirst());

		// Remove the Last element
		// using removeLast() method
		cld.removeLast();

		// Displaying the existing LinkedDeque
		System.out.println("ConcurrentLinkedDeque: " + cld);
	}

}
