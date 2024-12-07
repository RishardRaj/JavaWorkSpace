//MyComparator.java
package com.nt.collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2 = o2.toString();
		int result = s1.compareTo(s2);
		return result;
	}

}
