package com.nt.basic;

public class Scoop {
	int x;

	static int thrower() throws Exception {
		return 42;
	}

	public static void main(String[] args) {
		try {
			int x = thrower();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// System.out.println("x = " + ++x);
		}
	}
}
