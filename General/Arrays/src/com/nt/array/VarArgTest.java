//VarArgTest.java
package com.nt.array;

public class VarArgTest {
	public static void add(int... x) {
		int total = 0;
		for (int i = 0; i < x.length; i++) {
			total = total + x[i];
		}
	}
	System.out.println(total);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		add(12323, 132424);
		add(13232, 32132142, 24124214);
		add(232124, 124214, 2421414, 123214124);

	}

}
