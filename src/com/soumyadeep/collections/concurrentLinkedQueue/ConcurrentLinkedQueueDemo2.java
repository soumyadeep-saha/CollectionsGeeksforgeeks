package com.soumyadeep.collections.concurrentLinkedQueue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueDemo2 {

	public static void main(String[] args) {

		// Java code to illustrate 
		// methods of ConcurrentLinkedQueue 
		// Create a ConcurrentLinkedQueue
		// using ConcurrentLinkedQueue() contructor
		ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<Integer>();

		clq.add(12);
		clq.add(70);
		clq.add(1009);
		clq.add(475);

		// Displaying the existing LinkedQueue
		System.out.println("ConcurrentLinkedQueue: " + clq);

		// Displaying the first element
		// using peek() method
		System.out.println("First Element is: " + clq.peek());

		// Remove and display the first element
		// using poll() method
		System.out.println("Head Element is: " + clq.poll());

		// Displaying the existing LinkedQueue
		System.out.println("ConcurrentLinkedQueue: " + clq);

		// Get the size using size() method
		System.out.println("Size: " + clq.size());
	}

}
