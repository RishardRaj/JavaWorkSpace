//MembersDemo.java
package com.nt.regularinnerclass;

public class MembersDemo {
	int x = 10;
	static int y = 20;

	class Inner {

		public void m1() {
			System.out.println(x);
			System.out.println(y);
			System.out.println("From inner Class OuterClass static,instance members can access directly");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MembersDemo membersDemo = new MembersDemo();
		MembersDemo.Inner inner = membersDemo.new Inner();
		inner.m1();

	}

}
