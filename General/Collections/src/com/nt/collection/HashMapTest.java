//HashMapTest.java
package com.nt.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class HashMapTest {
	public static void main(String[] args) {
		//HashMap m = new HashMap();
		IdentityHashMap<Integer,String> m=new IdentityHashMap<>();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		m.put(i1, "pavan");
		m.put(i2, "kalyan");
		System.out.println(m);
	}
}
