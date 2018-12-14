package com.soumyadeep.collections.linkedblockingdeque;

import java.util.concurrent.LinkedBlockingDeque;

public class GFG2 {

	public static void main(String[] args) {

		// Java code to illustrate methods of LinkedBlockingDeque
		// create object of LinkedBlockingDeque
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();

		// Add numbers to end of LinkedBlockingDeque
		// using add() method
		LBD.add(7855642);
		LBD.add(35658786);
		LBD.add(5278367);
		LBD.add(74381793);

		// prints the Deque
		System.out.println("Linked Blocking Deque: " + LBD);

		// prints the size of Deque after removal
		// using size() method
		System.out.println("Size of Linked Blocking Deque: " + LBD.size());

		// removes the front element and prints it
		// using removeFirst() method
		System.out.println("First element: " + LBD.removeFirst());

		// prints the Deque
		System.out.println("Linked Blocking Deque: " + LBD);

		// prints the size of Deque after removal
		// using size() method
		System.out.println("Size of Linked Blocking Deque: " + LBD.size());

		// Add numbers to end of LinkedBlockingDeque
		// using offer() method
		LBD.offer(20);

		// prints the Deque
		System.out.println("Linked Blocking Deque: " + LBD);

		// prints the size of Deque after removal
		// using size() method
		System.out.println("Size of Linked Blocking Deque: " + LBD.size());
	}

}
