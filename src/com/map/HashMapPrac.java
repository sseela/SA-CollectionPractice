package com.map;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapPrac {
	public static void main(String[] args) {
		
		HashMap<String, Integer> hashmap = new HashMap<>();
		hashmap.put("sandeep", 78);
		hashmap.put("rupesh", 67);
		hashmap.put("shabaz", 60);
		hashmap.put(null, null);
		hashmap.put(null, 90);
		System.out.println(hashmap);
	}
}
