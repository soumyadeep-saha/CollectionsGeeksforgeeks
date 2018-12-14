package com.soumyadeep.collections.concurrentLinkedQueue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueDemo1 {

	public static void main(String[] args) {

		// Java program to demonstrate ConcurrentLinkedQueue 
		// Create a ConcurrentLinkedQueue
		// using ConcurrentLinkedQueue() contructor
		ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<Integer>();

		clq.add(12);
		clq.add(70);
		clq.add(1009);
		clq.add(475);

		// Displaying the existing LinkedQueue
		System.out.println("ConcurrentLinkedQueue: " + clq);

		// Create a ConcurrentLinkedQueue
		// using ConcurrentLinkedQueue(Collection c) contructor
		ConcurrentLinkedQueue<Integer> clq1 = new ConcurrentLinkedQueue<Integer>(clq);

		// Displaying the existing LinkedQueue
		System.out.println("ConcurrentLinkedQueue1: " + clq1);
	}

}
