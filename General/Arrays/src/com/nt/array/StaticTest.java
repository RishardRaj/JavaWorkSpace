//StaticTest.java
package com.nt.array;

public class StaticTest {
	int x = 10;
	static int y = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest staticTest=new StaticTest();
		staticTest.x=888;
		staticTest.y=999;
		StaticTest staticTest2=new StaticTest();
		System.out.println(staticTest2.x+"-----------"+staticTest2.y);
	}

}
