//WeakHashmapDemo.java
package com.nt.collection;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WeakHashMap<Temp, String> hashMap = new WeakHashMap<>();
		HashMap<Temp, String> hashMap = new HashMap<>();
		Temp temp = new Temp();
		hashMap.put(temp, "RAJ");
		temp = null;
		System.gc();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(hashMap);
	}

}
