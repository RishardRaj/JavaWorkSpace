//String_StringBuffer.java
package com.nt.wrapper;

public class String_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Raj");
		String s2 = new String("Raj");
		StringBuffer sb1 = new StringBuffer("Raj");
		StringBuffer sb2 = new StringBuffer("Raj");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println("=================");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));

	}

}
