//ArrayListDemo.java
package com.nt.generic;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void methodOne(ArrayList arrayList) {
		arrayList.add(23232);
		arrayList.add("RAJA");
		arrayList.add(10.5);
	}

	public static void main(String[] args) {
		ArrayList<String> arrayList = null;
		arrayList = new ArrayList<String>();
		// arrayList.add(235);
		arrayList.add("Raja");
		// arrayList.add(20.4);
		methodOne(arrayList);
		System.out.println(arrayList);
	}
}