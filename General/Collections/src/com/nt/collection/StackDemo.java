//Stack.java
package com.nt.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class StackDemo {
	public static void main(String[] args) {
		Stack stack = new Stack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack);
		System.out.println(stack.search("B"));
		System.out.println(stack.search("Z"));
		///////////////
		Vector vector = new Vector<>();
		vector.add(stack);
		Enumeration enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			Object character = (Object) enumeration.nextElement();
			System.out.println(character);
		}
		/////////////////
		Iterator iterator = vector.iterator();
		ListIterator listIterator = vector.listIterator();
		System.out.println(enumeration.getClass().getName());
		System.out.println(iterator.getClass().getName());
		System.out.println(listIterator.getClass().getName());

	}
}
