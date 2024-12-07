//A.java
package com.nt.deadlock;

public class A {
	public synchronized void d1(B b) {
		System.out.println("Thread t1 starts execution of d1 method");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Thread t1 trying to call B's last() method");
			b.last();
		}
	}

	public synchronized void last() {
		System.out.println("Inside A,this is last() method");
	}
}
