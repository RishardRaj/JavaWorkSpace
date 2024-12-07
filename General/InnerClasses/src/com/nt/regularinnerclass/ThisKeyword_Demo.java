//ThisKeyword_Demo.java
package com.nt.regularinnerclass;

public class ThisKeyword_Demo {
	int x = 10;

	class Inner {
		int x = 100;

		public void m1() {
			int x = 1000;
			System.out.println(x);
			System.out.println("In InnerClass this always refers to innerclass object");
			System.out.println(this.x);
			System.out.println(ThisKeyword_Demo.this.x);
		}// m1()
	}// inner

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThisKeyword_Demo().new Inner().m1();
	}

}
