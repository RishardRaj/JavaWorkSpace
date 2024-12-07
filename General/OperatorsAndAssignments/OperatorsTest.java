//OperatorsTest.java
package com.nt.operatorsandassignments;

public class OperatorsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 15;
		// int a=10,b=20;
		final int a = 10, b = 20;
		if (++x > 10 || ++y < 15) {
			++x;
		} else {
			++y;
		}
		System.out.println(x + "------------" + y);
		byte c1 = (a > b) ? 30 : 40;
		byte c2 = (a < b) ? 30 : 40;
		System.out.println(c1);// 40
		System.out.println(c2);// 30
	}

}