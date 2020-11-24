package com.utiltiyClass;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class ArraysPrac {
	public static void main(String[] args) {
		
		String[] strArray = {"sandeep", "vamsi", "chaitu", "rohit"};
		List<String> list = Arrays.asList(strArray);
		System.out.println(list);
		list.set(1, "nars");
		System.out.println(list);
	}
}
