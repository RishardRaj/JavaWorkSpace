//StaticInnerclassTest.java
package com.nt.staticnestedinnerclass;

public class StaticInnerClassTest {
	 int x = 20;
	static int y = 10;

	static class Inner {
		static int z = 200;
		public void m1(){
			System.out.println(x);
		}
		public static void main(String[] args) {
			System.out.println("static nested class main method");
			System.out.println(
					"In Normal inner class we can access both static and non-static members from outer class but in the case of static nested inner class we can access only static members from outer class");
			System.out.println(y);
			System.out.println(z);
			Inner inner=new Inner();
			inner.m1();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Outer class main method");
	}

}
