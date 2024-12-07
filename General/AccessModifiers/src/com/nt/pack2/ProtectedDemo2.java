//ProtectedDemo2.java
package com.nt.pack2;

import com.nt.pack1.ProtectedDemo1;

public class ProtectedDemo2 extends ProtectedDemo1 {
	public static void main(String[] args) {
		ProtectedDemo1 protectedDemo1 = null;
		ProtectedDemo2 protectedDemo2 = null;
		protectedDemo1 = new ProtectedDemo1();
		protectedDemo2 = new ProtectedDemo2();
		protectedDemo2.methodOne();
		System.out.println(
				"For Accessing Protected Member of parent in Child we should use only Child reference only if child is there in Outside package but in Parent Class For accessing Protected members of parent and child we can use both Parent and Child references");
	}
}
