//Test.java
package com.nt.exception;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		try {
			System.out.println(10 / 0);
			System.out.println("Second Line Wont Execute Eventhough We handled that Exception");
		} catch (ArithmeticException arithmeticException) {
			// TODO: handle exception
			arithmeticException.printStackTrace();
			System.out.println("===============");
			System.out.println(arithmeticException.toString());
			System.out.println("-----------------");
			System.out.println(arithmeticException.getMessage());
			System.out.println(10 / 2);
		}
		System.out.println("End");
	}

}
