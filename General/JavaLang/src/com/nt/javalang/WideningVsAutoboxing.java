//WideningVsAutoboxing.java
package com.nt.javalang;

public class WideningVsAutoboxing {
	public void methodOne(long l) {
		System.out.println("Widening");
	}

	public void methodOne(Integer i) {
		System.out.println("Auto boxing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		//int i = 10;
		WideningVsAutoboxing wideningVsAutoboxing = null;
		wideningVsAutoboxing = new WideningVsAutoboxing();
		wideningVsAutoboxing.methodOne(10);
		System.out.println("Widening dominates Autoboxing");
	}

}
