package com.soumyadeep.collections.weakHashMap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapdemo3 {

	public static void main(String[] args) {

		Map<Number, String> weak = new WeakHashMap<Number, String>();
		weak.put(1, "geeks");
		weak.put(2, "for");
		weak.put(3, "geeks");

		Map<Number, String> weak1 = new WeakHashMap<Number, String>();
		weak1.putAll(weak);

		// getting value of key 2
		System.out.println(weak1.get(2));

		// size of map
		System.out.println("Size of map is: " + weak1.size());

		// removing 2nd element
		weak1.remove(2);

		// size after removing key and value pair
		System.out.println("Size after removing: " + weak1.size());
	}

}
