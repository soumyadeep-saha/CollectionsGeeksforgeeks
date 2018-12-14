package com.soumyadeep.collections.iterators.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class GfG2 {

	// Java program to create a Sequential Stream
	// from an Iterator
	// Function to create a sequential Stream
	// from an Iterator
	public static <T> Stream<T> iteratorToSequentialStream(Iterator<T> itr) {
		// Get an iterable from itr
		Iterable<T> itb = () -> itr;

		// Get spliterator() from iterable and then
		// Convert into a sequential stream.
		// The second parameter "false" passess whether the
		// stream is to be created parallel or not
		return StreamSupport.stream(itb.spliterator(), false);
	}

	public static void main(String[] args) {
		Iterator<String> iterator = Arrays.asList("G", "E", "E", "K", "S").iterator();

		Stream<String> stream = iteratorToSequentialStream(iterator);

		System.out.println("Sequential Stream : " + stream.collect(Collectors.toList()));
	}

}
