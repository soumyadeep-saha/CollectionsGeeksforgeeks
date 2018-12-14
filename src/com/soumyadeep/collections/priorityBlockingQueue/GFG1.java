package com.soumyadeep.collections.priorityBlockingQueue;

import java.util.concurrent.PriorityBlockingQueue;

public class GFG1 {

	public static void main(String[] args) {

		// Java program to demonstrate 
		// PriorityBlockingQueue() constructor 
		// create object of PriorityBlockingQueue
		// using PriorityBlockingQueue() constructor
		PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>();

		// add numbers
		pbq.add(1);
		pbq.add(2);
		pbq.add(3);
		pbq.add(4);
		pbq.add(5);

		// print queue
		System.out.println("PriorityBlockingQueue:" + pbq);
	}

}
