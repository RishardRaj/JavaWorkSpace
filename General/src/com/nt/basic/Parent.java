//Parent.java
package com.nt.basic;

public class Parent {
	int i;

	public void display() {
		System.out.println(i);
	}
	
	public Object test() {
		System.out.println("Object version");
		return new Object();
	}
}
