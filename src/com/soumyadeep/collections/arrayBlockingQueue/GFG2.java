package com.soumyadeep.collections.arrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class GFG2 {

	public static void main(String[] args) {

		//Adding elements in ArrayBlockingQueue
		// define capacity of ArrayBlockingQueue
		int capacity = 15;

		// create object of ArrayBlockingQueue
		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<Integer>(capacity);

		// add numbers
		abq.add(1);
		abq.add(2);
		abq.add(3);

		// print queue
		System.out.println("ArrayBlockingQueue:" + abq);
	}
}
