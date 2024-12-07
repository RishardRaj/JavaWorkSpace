//Employee.java
package com.nt.basic;

import java.util.Comparator;
import java.util.TreeSet;

public class SortingApp {
	public static void main(String[] args) {
		Emp e1 = new Emp("nag", 100);
		Emp e2 = new Emp("balaiah", 200);
		Emp e3 = new Emp("chiru", 50);
		Emp e4 = new Emp("venki", 150);
		Emp e5 = new Emp("nag", 100);
		TreeSet t1 = new TreeSet();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);// [chiru----50, nag----100, venki----150,
								// balaiah----200]
		TreeSet t2 = new TreeSet(new MyComparator());
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		System.out.println(t2);// [balaiah----200, chiru----50, nag----100,
								// venki----150]
	}
}
