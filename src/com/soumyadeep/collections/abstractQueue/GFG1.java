package com.soumyadeep.collections.abstractQueue;

import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class GFG1 {

	public static void main(String[] args) {

		// Java code to illustrate AbstractQueue
		// Creating object of AbstractQueue<Integer>
		AbstractQueue<Integer> AQ = new LinkedBlockingQueue<Integer>();

		// Populating AQ
		AQ.add(10);
		AQ.add(20);
		AQ.add(30);
		AQ.add(40);
		AQ.add(50);

		// print AQ
		System.out.println("AbstractQueue contains: " + AQ);
	}

}
