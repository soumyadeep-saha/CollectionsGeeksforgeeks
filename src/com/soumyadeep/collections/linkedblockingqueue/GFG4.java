package com.soumyadeep.collections.linkedblockingqueue;

import java.util.concurrent.LinkedBlockingQueue;

public class GFG4 {

	public static void main(String[] args) {

		// Adding elements in LinkedBlockingQueue
		// define capacity of LinkedBlockingQueue
		int capacity = 15;

		// create object of LinkedBlockingQueue
		LinkedBlockingQueue<Integer> lbq = new LinkedBlockingQueue<Integer>(capacity);

		// add numbers
		lbq.add(1);
		lbq.add(2);
		lbq.add(3);

		// print queue
		System.out.println("LinkedBlockingQueue:" + lbq);
	}

}
