//Outer.java
package com.nt.anonymousinnerclass;

public class Outer {
	static class Inner {
		public void m1() {
			System.out.println("static nested class method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner inner = new Inner();
		inner.m1();
	}

}
