package com.map;

import java.util.IdentityHashMap;

public class IdentityHashMapPrac {
	public static void main(String[] args) {
		IdentityHashMap<Integer, Integer> id = new IdentityHashMap<>();
		id.put(222, 1);
		id.put(222, 2);
		id.put(999, 3);
		id.put(222, 4);
		System.out.println(id);
	}
}
