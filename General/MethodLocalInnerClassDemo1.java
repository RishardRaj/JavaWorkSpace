//MethodLocalInnerClassDemo1.java
package com.nt.methodlocalinnerclass;

public class MethodLocalInnerClassDemo1 {
	int x = 10;
	static int y = 20;

	public void m1() {
		class Inner {
			public void m2() {
				System.out.println(
						"If we declare method local innerclass inside instance method of outer class we can access both static,instance members of that outer class from inner class");
				System.out.println(x);
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
