//Test1.java
package com.nt.exception;

public class Test1 {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} 
		
		catch (Exception exception) {
			// TODO: handle exception
			exception.printStackTrace();
		} catch (ArithmeticException arithmeticException) {
			// TODO: handle exception
			arithmeticException.printStackTrace();
		}
	}
}
