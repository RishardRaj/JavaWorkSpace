//Test.java
package com.nt.wrapper;

public class Test {
/*	public static void m1(Long l)
	{
	System.out.println("Widening followed by autoboxing not allowed");
	}*/
	public static void m1(Object object)
	{
	System.out.println("Autoboxing followed by Widening allowed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		Test.m1(x);
	}

}
