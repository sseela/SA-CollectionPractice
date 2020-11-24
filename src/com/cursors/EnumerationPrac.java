package com.cursors;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

public class EnumerationPrac {
	public static void main(String[] args) {
		
		/*Applicable only for legacy classes. It is available from method elements*/
		Vector<String> vector = new Vector<>();
		vector.add("first");
		vector.add("second");
		System.out.println(vector);
		Enumeration<String> en = vector.elements();
		if(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		Stack<String> s = new Stack<>();
		s.elements();
		
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		hashtable.elements();
		
		Properties p = new Properties();
		p.elements();
	}
}
