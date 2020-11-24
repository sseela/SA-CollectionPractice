package com.set;

import java.util.HashSet;
import java.util.Hashtable;

public class HashSetPrac {
	public static void main(String[] args) {
		
		/*Data Structure - Hashtable Initial capacity - 16. fill ratio -75%*/
		/*duplicates are not allowed. one null allowed. hetero allowed*/
		/*HashSet internally creates HashMap and store data as keys and values are kept a constant object*/
		HashSet hashSet = new HashSet<>();
		hashSet.add("sandeep");
		hashSet.add("sasi");
		hashSet.add("rupesh");
		hashSet.add("Shabaz");
		hashSet.add("Shabaz");
		hashSet.add(null);
		hashSet.add(123L);
		System.out.println(hashSet);
	}
}
