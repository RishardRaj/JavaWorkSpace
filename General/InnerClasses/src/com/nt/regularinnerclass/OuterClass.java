//InnerClassDemo.java
package com.nt.regularinnerclass;

public class OuterClass {
	public class InnerClass {
		public void m1() {
			System.out.println("Inner class Method");
		}// m1
	}

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass outerInner = outerClass.new InnerClass();
		outerInner.m1();
	}
}