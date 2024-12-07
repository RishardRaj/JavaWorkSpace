//TreeMapDemo.java
package com.nt.collection;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap t = new TreeMap();
		t.put(100, "ZZZ");
		t.put(103, "YYY");
		t.put(101, "XXX");
		t.put(104, 106);
		t.put(107, null);
		// t.put("FFF","XXX");//ClassCastException
		// t.put(null,"xxx");//NullPointerException
		System.out.println(t);// {100=ZZZ, 101=XXX, 103=YYY, 104=106, 107=null}
	}
}
