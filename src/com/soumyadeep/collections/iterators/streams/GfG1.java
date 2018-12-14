package com.soumyadeep.collections.iterators.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class GfG1 {

	// Java program to create a Sequential Stream
	// from an Iterator
	// Function to create a sequential Stream
	// from an Iterator
	public static <T> Stream<T> iteratorToSequentialStream(Iterator<T> itr) {
		// convert the iterator into a Spliterator
		Spliterator<T> spitr = Spliterators.spliteratorUnknownSize(itr, Spliterator.NONNULL);

		// Convert spliterator into a sequential stream
		// The second parameter "false" passess whether
		// the stream is to be created parallel or not
		return StreamSupport.stream(spitr, false);
	}

	public static void main(String[] args) {
		Iterator<String> iterator = Arrays.asList("G", "E", "E", "K", "S").iterator();

		Stream<String> stream = iteratorToSequentialStream(iterator);

		System.out.println("Sequential Stream : " + stream.collect(Collectors.toList()));
	}

}
