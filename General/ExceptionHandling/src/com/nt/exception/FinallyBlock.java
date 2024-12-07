//FinallyBlock.java
package com.nt.exception;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			System.out.println("Try");
			System.out.println(10 / 0);
		} catch (NullPointerException nullPointerException) {
			// TODO: handle exception
			System.out.println("catch");
		} finally {
			System.out.println("Finally");
		}
	}
}
