//CollectionDemo.class
package com.nt.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("L");
		l.add(new Integer(10));
		//l.add(null);// NullPointerException
		System.out.println("Before sorting :" + l);// [Z, A, K, L, 10]
		Collections.sort(l, new MyComparator());
		System.out.println("After sorting :" + l);// [Z, L, K, A, 10]
	}
}
