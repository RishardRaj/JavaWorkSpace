//ThrowDemoTest.java1
package com.nt.exception;

public class ThrowDemoTest {
	static ArithmeticException arithmeticException = new ArithmeticException();

	public static void main(String[] args) {
		throw arithmeticException;
	}
}
