//FinallyVsReturnDemo.java
package com.nt.exception;

public class FinallyVsReturnDemo {
	public static void main(String[] args) {
		System.out.println(m1());
	}

	public static int m1() {
		try {
			return 777;
		} catch (Exception e) {
			// TODO: handle exception
			return 8888;
		} finally {
			System.out.println(
					"If try,catch,finally blocks contains return statement the return statement kept in finally block will be taken");
			return 9999;
		}

	}
}
