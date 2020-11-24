package com.cg.prac;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;



public class ArrayListPrac implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {
		List<String> list = new ArrayList<>();
		list.add("sandeep");
		list.add("rupesh");
		list.add("shannu");
		list.add("sasi");
		list.add(null);
		list.add(null);
		System.out.println(list);
		
		Object[] strArr = list.toArray();
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		list.remove("sandeep");
		System.out.println(list);
		
		/*Collection specific methods: add, addAll, remove, removeAll, contains, containsAll, retainAll, clear, isEmpty, size, iterator, toArray*/
		
		
		list.add(1, "shabaz");
		list.remove(2);
		String str = list.get(1);
		System.out.println(str);
		list.set(1, "sandeep");
		System.out.println(list);
		System.out.println(list.indexOf("sasi"));
		ListIterator<String> ltr = list.listIterator();

		/*List Specific method based on index advantage:
	
		add(index, obj)
		addAll(index, coll)
		remove(index)
		get(index)
		set(index, obj)
		indexOf(obj)
		listIterator()*/

	}

}
