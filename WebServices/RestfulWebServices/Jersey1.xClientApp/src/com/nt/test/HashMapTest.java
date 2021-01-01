package com.nt.test;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap = new HashMap<>();
		//String s1=new String("FB");
		//String s2=new String("Ea");
		hashMap.put("FB", 1);
		hashMap.put("Ea", 2);
		//hashMap.remove("FB");
		//System.out.println(s1.hashCode()+"----------"+s2.hashCode());
		System.out.println(hashMap);
		hashMap.clear();
	}

}
