package com.nt.basic;

public class InheritenceTest {
	public static void main(String[] args) {
		Parent parent = null;
		Child child = new Child();
		/*
		 * parent.i = 1; Child.j = 2; parent.display();
		 */
		Integer i = child.test();
		System.out.println(i);
	}
}
