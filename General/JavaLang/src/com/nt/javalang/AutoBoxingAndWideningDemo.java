//AutoboxingAndWideningDemo.java
package com.nt.javalang;

public class AutoBoxingAndWideningDemo {
	public static void main(String[] args) {
		int i = 10;
		AutoBoxingAndWideningDemo autoBoxingAndWideningDemo=null;
		autoBoxingAndWideningDemo=new AutoBoxingAndWideningDemo();
		autoBoxingAndWideningDemo.methodOne(i);
	}

	public void methodOne(Object object) {
		// TODO Auto-generated method stub
		System.out.println("AutoBoxing followed by Widening is allowed where as revese is not allowed");
	}
}
