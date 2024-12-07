//ProtectedDemo3.java
package com.nt.pack1;

public class ProtectedDemo3 extends ProtectedDemo1 {
	public static void main(String[] args) {
		ProtectedDemo1 protectedDemo1 = null;
		ProtectedDemo3 protectedDemo3 = null;
		protectedDemo1 = new ProtectedDemo1();
		protectedDemo3 = new ProtectedDemo3();
		protectedDemo1.methodOne();
		protectedDemo3.methodThree();

	}

	protected void methodThree() {
		System.out.println("From ProtectedDemo3");
	}
}
