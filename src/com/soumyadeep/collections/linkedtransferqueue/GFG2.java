package com.soumyadeep.collections.linkedtransferqueue;

import java.util.concurrent.LinkedTransferQueue;

public class GFG2 {

	public static void main(String[] args) {

		// create object of LinkedTransferQueue
		LinkedTransferQueue<Integer> LTQ = new LinkedTransferQueue<Integer>();

		// Add numbers to end of LinkedTransferQueue
		// using add() method
		LTQ.add(7855642);
		LTQ.add(35658786);
		LTQ.add(5278367);
		LTQ.add(74381793);

		// prints the Deque
		System.out.println("Linked Transfer Queue: " + LTQ);

		// prints the size of Deque after removal
		// using size() method
		System.out.println("Size of Linked Transfer Queue: " + LTQ.size());

		// removes the front element and prints it
		// using poll() method
		System.out.println("First element: " + LTQ.poll());

		// prints the Deque
		System.out.println("Linked Transfer Queue: " + LTQ);

		// prints the size of Deque after removal
		// using size() method
		System.out.println("Size of Linked Transfer Queue: " + LTQ.size());

		// Add numbers to end of LinkedTransferQueue
		// using offer() method
		LTQ.offer(20);

		// prints the Deque
		System.out.println("Linked Transfer Queue: " + LTQ);

		// prints the size of Deque after removal
		// using size() method
		System.out.println("Size of Linked Transfer Queue: " + LTQ.size());
	}

}
