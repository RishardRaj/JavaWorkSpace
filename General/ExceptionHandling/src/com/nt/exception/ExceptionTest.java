package com.nt.exception;

public class ExceptionTest {
	public static void main(String[] args) {
		System.out.println("statement1");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println(10 / 2);
		}
		System.out.println("statement3");
	}
}