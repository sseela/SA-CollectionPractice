package com.cg.prac;

import java.util.LinkedList;
import java.util.TreeSet;

public class LinkedListPrac {
	public static void main(String[] args) {
		
		/*DataStructure is DoublyLinkedList*/
		
		LinkedList<String> l = new LinkedList<>();
		l.add("sandeep");
		l.add("rupesh");
		l.add("shanmukh");
		l.add("sasi");
		System.out.println(l);
		
		/*Using list specific methods*/
		
		l.add(2, "shabaz");
		l.remove(3);
		System.out.println(l);
		
		/*using LinkedList specific methods - getFirst, getLast, addFirst, addLast, removeFirst, removeLast*/
		System.out.println(l.getFirst());
		l.addFirst("pavan");
		l.addLast("uppalapati");
		l.removeLast();
		l.removeFirst();
		System.out.println(l);
		
		
	}
}
