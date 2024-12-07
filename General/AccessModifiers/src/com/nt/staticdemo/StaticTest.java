//StaticTest.java
package com.nt.staticdemo;

public class StaticTest {
	int x = 30;
	static int y = 456;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest staticTest = new StaticTest();
		StaticTest staticTest1 = new StaticTest();
		staticTest1.x = 50433;
		staticTest1.y = 384063;
		System.out.println(staticTest.x + "--------" + StaticTest.y);
		System.out.println(staticTest1.x + "------------------" + staticTest1.y);
		System.out.println(
				"We cannot access instance variables directly from static area but we can access static members directly from both static area and instance area");
	}

}
