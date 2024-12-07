//ArrayListMaxCapacityDemo.java
package com.nt.collection;

import java.util.ArrayList;

public class ArrayListMaxCapacityDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>(16);
		System.out.println(arrayList.size());
		arrayList.trimToSize();
		for (int i = 0; i < 17; i++) {
			arrayList.add("RAJ");
		}
		System.out.println(arrayList.get(16));
		System.out.println(arrayList.size());
	}
}

