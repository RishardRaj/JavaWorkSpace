//Innerclass_InstanceAreaAccess.java
package com.nt.regularinnerclass;

public class InnerClass_InstanceAreaAccess {
	public class InnerClass {
		public void m1() {
			System.out.println("Inner Class method");
		}// m1
	}// InnerClass

	public void m2() {
		InnerClass innerClass = new InnerClass();
		innerClass.m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass_InstanceAreaAccess innerClass_InstanceAreaAccess = new InnerClass_InstanceAreaAccess();
		innerClass_InstanceAreaAccess.m2();
	}

}
