//InnerClassAccess_OtherClass.java
package com.nt.regularinnerclass;

public class InnerClassAccess_OtherClass {
	public class InnerClass {
		public void m1() {
			System.out.println("InnerClass Method");
		}// m1
	}// innerclass

	public void m2() {
		System.out.println("OuterClass Method");
		InnerClass innerClass = new InnerClass();
		innerClass.m1();
	}//m2()
}// InnerClassAccess_OtherClass
