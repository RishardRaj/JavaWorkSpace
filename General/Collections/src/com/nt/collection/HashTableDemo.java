//HashTableDemo.java
package com.nt.collection;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(new HashTemp(5), "A");
		h.put(new HashTemp(2), "B");
		h.put(new HashTemp(6), "C");
		h.put(new HashTemp(15), "D");
		h.put(new HashTemp(23), "E");
		h.put(new HashTemp(16), "F");
		System.out.println(h);// {6=C, 16=F, 5=A, 15=D, 2=B, 23=E}
	}
}
