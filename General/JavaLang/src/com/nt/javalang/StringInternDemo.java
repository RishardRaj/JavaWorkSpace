//StringInternDemo.java
package com.nt.javalang;

public class StringInternDemo {
	public static void main(String[] args) {
		/*
		 * char ch[] = null; String s = null; ch = new char[] { 'R', 'A', 'J' };
		 */ char ch[] = { 'R', 'A', 'J' };
		String s = null;
		s = new String(ch);
		System.out.println(s);
	}
}