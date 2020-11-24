package com.set;

import java.util.LinkedHashSet;

public class LinkedHashSetPrac {
	public static void main(String[] args) {
		
		LinkedHashSet<String> linked = new LinkedHashSet<>();
		linked.add("sandeep");
		linked.add("sasi");
		linked.add("rupesh");
		linked.add("Shabaz");
		linked.add("Shabaz");
		linked.add(null);
		System.out.println(linked);
	}
}
