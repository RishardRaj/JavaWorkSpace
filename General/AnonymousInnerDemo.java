//AnonymousInnerDemo.java

package com.nt.basic;

public class AnonymousInnerDemoTest {
	public static void main(String[] args) {
		AnonymousInner anonymousInner = new AnonymousInner() {
			public void test() {
				System.out.println("test method from AnonymousInnerDemoTest class");
			}

			public void m1() {
				System.out.println("m1 method from AnonymousInner Class");
			}
		};
		anonymousInner.m1();
		anonymousInner.test();
		AnonymousInner anonymousInner2 = new AnonymousInner();
		anonymousInner2.test();
	}
}
   