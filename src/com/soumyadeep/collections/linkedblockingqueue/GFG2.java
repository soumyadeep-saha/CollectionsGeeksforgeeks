package com.soumyadeep.collections.linkedblockingqueue;

import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;

public class GFG2 {

	public static void main(String[] args) {

		// Java program to demonstrate 
		// LinkedBlockingQueue(Collection c) constructor 
		// Creating a Collection
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		v.addElement(5);

		// create object of LinkedBlockingQueue
		// using LinkedBlockingQueue(Collection c) constructor
		LinkedBlockingQueue<Integer> lbq = new LinkedBlockingQueue<Integer>(v);

		// print queue
		System.out.println("LinkedBlockingQueue:" + lbq);
	}

}
