package com.cursors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorPrac {
	public static void main(String[] args) {
		
		/*Applicable only for list related classes*/
		List<String> list = new ArrayList<>();
		list.add("sandeep");
		list.add("rupesh");
		list.add("shannu");
		list.add("sasi");
		list.add(null);
		list.add(null);
		
		ListIterator<String> itr = list.listIterator();
		/*hasNext, next, remove, hasPrevious, previous, add, set*/
		while(itr.hasNext()) {
			if(itr.next() == null) {
				itr.add("shabaz");
			}
		}
		System.out.println(list);
		
		List<String> l = Collections.unmodifiableList(list);
		System.out.println(l.add("ffff"));
	}
}
