//ArrayListMaxCapacityDemo.java
package com.nt.collection;

import java.util.ArrayList;

public class ArrayListMaxCapacictyDemo {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList(16);
		System.out.println(arrayList.size());
		arrayList.trimToSize();
		for (int i = 0; i < 17; i++) {
			arrayList.add("RAJ");
		}
		arrayList.add(null);
		arrayList.add(null);
		arrayList.add(new Integer(10));
		System.out.println(arrayList.get(16));
		System.out.println(arrayList.size());
		System.out.println(arrayList);
	}
}
