package com.soumyadeep.collections.weakHashMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class WeakHashMapdemo2 {

	public static void main(String[] args) {

		Map<Number, String> weak = new WeakHashMap<Number, String>();
		weak.put(1, "geeks");
		weak.put(2, "for");
		weak.put(3, "geeks");

		Set set1 = weak.entrySet();

		// Checking set
		System.out.println(set1);

		// Creating set for key
		Set keySet = weak.keySet();

		// Checking keySet
		System.out.println("key set: " + keySet);

		Collection value = weak.values();

		// Checking values of map
		System.out.println("values: " + value);
	}

}
