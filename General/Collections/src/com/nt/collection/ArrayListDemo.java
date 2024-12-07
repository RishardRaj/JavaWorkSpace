//ArrayListDemo.java
package com.nt.collection;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add(10);
		arrayList.add("A");
		arrayList.add(null);
		System.out.println(arrayList);
		arrayList.remove(2);
		System.out.println(arrayList);
		arrayList.add(2, "M");
		arrayList.add("N");
		System.out.println(arrayList);
	}
}
