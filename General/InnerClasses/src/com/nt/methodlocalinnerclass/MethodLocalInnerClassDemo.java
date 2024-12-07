//MethodLocalInnerClassDemo.java
package com.nt.methodlocalinnerclass;

public class MethodLocalInnerClassDemo {
	public static void m1() {
		class Inner {
			public void sum(int x, int y) {
				System.out.println(x + y);
			}// method

			public void sum(int x, int y, int z) {
				System.out.println(x + y + z);
			}// method
		}// inner
		Inner inner = new Inner();
		inner.sum(46, 60030);
		inner.sum(136, 5415, 1541);
	}// m1()

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

}
