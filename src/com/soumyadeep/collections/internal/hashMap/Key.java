package com.soumyadeep.collections.internal.hashMap;

import java.util.HashMap;

public class Key {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put(new Key1("vishal"), 20);
		map.put(new Key1("sachin"), 30);
		map.put(new Key1("vaibhav"), 40);

		System.out.println();
		System.out.println("Value for key sachin: " + map.get(new Key1("sachin")));
		System.out.println("Value for key vaibhav: " + map.get(new Key1("vaibhav")));
	}
}

class Key1 {
	String key;

	Key1(String key) {
		this.key = key;
	}

	@Override
	public int hashCode() {
		int hash = (int) key.charAt(0);
		System.out.println("hashCode for key: " + key + " = " + hash);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		return key.equals(((Key1) obj).key);
	}
}
