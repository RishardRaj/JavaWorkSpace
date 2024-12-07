//InterfaceDemo.java
package com.nt.specialcases;

interface Outer {
	public void m1();

	interface Inner {
		public void m2();
	}
}

public class InterfaceDemo implements Outer {
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println(
				"Every interface declared inside a interface is public and static eventhough it is declared or not");
		System.out.println(
				"without implementing inner interface we can implement outer interface directly and vice-versa");
	}

}

class Test111 {
	public static void main(String[] args) {
		InterfaceDemo interfaceDemo = new InterfaceDemo();
		interfaceDemo.m1();
	}
}