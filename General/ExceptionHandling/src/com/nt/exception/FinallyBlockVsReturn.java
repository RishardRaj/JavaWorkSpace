//FinallyVsReturn.java
package com.nt.exception;

public class FinallyBlockVsReturn {
	public static void main(String[] args) {
		try {
			System.out.println("try");
			return;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch");
			return;
		} finally {
			System.out.println("finally block dominates eventhough return statement present in try catch bloks");
		}
	}
}
