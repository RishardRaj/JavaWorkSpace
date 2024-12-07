//VarArg_Autoboxing.java
package com.nt.wrapper;

public class VarArg_Autoboxing {
	public static void m1(int... x) {
		System.out.println("var-arg method");
	}

	public static void m1(Integer x) {
		System.out.println("Autoboxing");
	}

	public static void main(String[] args) {
		int x = 10;
		VarArg_Autoboxing.m1(x);
	}
}//class