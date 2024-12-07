//HashMapDemo.java
package com.nt.collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> hashMap = null;
		hashMap = new HashMap<>();
		hashMap.put("first", new String("Raja"));
		System.out.println(hashMap);
		hashMap.put("first", new String("Ravi"));
		System.out.println(hashMap);
	}

}
