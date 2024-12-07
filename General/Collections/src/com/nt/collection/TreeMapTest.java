//TreeMapTest.java
package com.nt.collection;

import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap t = new TreeMap(new MyComparator());
		t.put("XXX", 10);
		t.put("AAA", 20);
		t.put("ZZZ", 30);
		t.put("LLL", 40);
		System.out.println(t);// {ZZZ=30, XXX=10, LLL=40, AAA=20}
	}
}
