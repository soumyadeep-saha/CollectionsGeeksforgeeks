package com.soumyadeep.collections.linkedblockingqueue;

import java.util.concurrent.LinkedBlockingQueue;

public class GFG3 {

	public static void main(String[] args) {

		// Java program to demonstrate 
		// LinkedBlockingQueue(int initialCapacity) constructor 
		// define capacity of LinkedBlockingQueue
		int capacity = 15;

		// create object of LinkedBlockingQueue
		// using LinkedBlockingQueue(int initialCapacity) constructor
		LinkedBlockingQueue<Integer> lbq = new LinkedBlockingQueue<Integer>(capacity);

		// add numbers
		lbq.add(1);
		lbq.add(2);
		lbq.add(3);

		// print queue
		System.out.println("LinkedBlockingQueue:" + lbq);
	}

}
