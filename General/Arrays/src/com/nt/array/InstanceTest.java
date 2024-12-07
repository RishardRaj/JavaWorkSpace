//InstanceTest.java
package com.nt.array;

public class InstanceTest {
	int i = 10;

	public static void main(String[] args) {
		// System.out.println(i);//C.E:non-static variable i cannot be
		// referenced from a static context(invalid)
		InstanceTest instanceTest = new InstanceTest();
		System.out.println(instanceTest.i);// 10(valid)
		instanceTest.methodOne();
	}

	public void methodOne() {
		System.out.println(i);// 10(valid)
	}
}