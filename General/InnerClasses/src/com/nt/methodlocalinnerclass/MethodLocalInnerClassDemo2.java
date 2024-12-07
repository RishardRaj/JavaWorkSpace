//MethodLocalInnerClassDemo2.java
package com.nt.methodlocalinnerclass;

public class MethodLocalInnerClassDemo2 {
	int x = 10;
	static int y = 20;

	public static void m1() {
		class Inner {
			public void m2() {
				System.out.println(
						"If we declare method local innerclass inside static method of outer class we can access only static members of that outer class from inner class");
				// System.out.println(x);
				System.out.println(y);
			}// m2
		}// inner
		Inner inner = new Inner();

		inner.m2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodLocalInnerClassDemo1 methodLocalInnerClassDemo1 = new MethodLocalInnerClassDemo1();
		methodLocalInnerClassDemo1.m1();
	}

}
