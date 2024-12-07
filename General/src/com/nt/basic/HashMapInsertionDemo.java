package com.nt.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapInsertionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "RAJ");
		map.put(1, "RAJ1");
		System.out.println(map.toString());
		List<String> list=new ArrayList<String>();
		list.add("RAJ1");
		list.add("RAJ2");
		list.add("RAJ3");
		list.add(1, "RAJ1-1");
		System.out.println(list.toString());
		
	}

}
