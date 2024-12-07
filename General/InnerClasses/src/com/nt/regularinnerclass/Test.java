//Test.java
package com.nt.regularinnerclass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * //OneWay of Accessing InnerClass from Other Class
		 * InnerClassAccess_OtherClass innerClassAccess_OtherClass = new
		 * InnerClassAccess_OtherClass(); innerClassAccess_OtherClass.m2();
		 */
		InnerClassAccess_OtherClass otherClass = new InnerClassAccess_OtherClass();
		InnerClassAccess_OtherClass.InnerClass innerClass = otherClass.new InnerClass();
		innerClass.m1();

	}

}
