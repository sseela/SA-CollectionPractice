package com.cg.prac;

import java.util.Stack;
import java.util.Vector;

public class VectorAndStack {
	public static void main(String[] args) {
		
		/*Vector underlying data structure is Resizable or growable array*/
		/*Vector is similar to ArrayList with intial capacity of 10. All methods are synchronizedd. */
		
		/*Stack is child of Vector. Works on principle of LIFO*/
		/*Stack methods are push, pop, peek, empty, search*/
		Vector<String> vector = new Vector<>();
		vector.add("sandy");
		vector.add(null);
		System.out.println(vector);
		
		Stack<String> stack = new Stack<>();
		stack.push("sandeep");
		stack.push("rupesh");
		stack.push("rupesh");
		stack.push("rupesh");
		stack.push(null);
		System.out.println(stack);
		stack.pop();
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.empty());
		System.out.println(stack.search("rupesh"));
	}
}
