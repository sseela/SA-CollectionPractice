package com.utiltiyClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsPrac {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("rupesh");
		list.add("anudeep");
		list.add("shannu");
		list.add("vamsi");
		//list.add(null);
		//list.add(null);
		System.out.println(list);
		Collections.sort(list);
		System.out.println("natural "+list);
		
		int i = Collections.binarySearch(list, "vamsi");
		System.out.println(i);
		
		Collections.sort(list, (str1, str2) -> str2.compareTo(str1));
		System.out.println("custom "+list);
		
		int i1 = Collections.binarySearch(list, "vamsi", (str1, str2) -> str2.compareTo(str1));
		System.out.println(i1);
		
		Collections.reverse(list);
		System.out.println("Reverse " +list);
		
		System.out.println(Collections.min(list));
		
	}
}
