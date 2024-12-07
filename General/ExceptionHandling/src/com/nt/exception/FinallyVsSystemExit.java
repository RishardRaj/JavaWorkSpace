//FinallyVsSystemExit.java
package com.nt.exception;

public class FinallyVsSystemExit {
public static void main(String[] args) {
	try{
		System.out.println("try");
		System.out.println("System.exit(any value) effect is same");
		System.exit(0);
		System.exit(1);
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("Catch");
	}
	finally {
		System.out.println("finally");
	}
}
}
