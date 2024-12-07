//MethodInnerDemo.java
package com.nt.basic;

public class MethodInnerDemo {
	int x = 10;

	public void methodOne() {
		final int y = 20;
		class Inner {
			public void methodTwo() {
				System.out.println(x);// 10
				System.out.println(y);
			}// methodTwo()
		}// innerclass
		Inner inner = new Inner();
		inner.methodTwo();
	}// methodOne()

	public static void main(String[] args) {
		new MethodInnerDemo().methodOne();
	}// main
}// class
