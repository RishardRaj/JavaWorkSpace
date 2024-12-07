//DeadLock.java
package com.nt.deadlock;

public class DeadLock extends Thread {
	A a = new A();
	B b = new B();

	public void m1() {
		this.start();
		a.d1(b);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		b.d2(a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLock deadLock = new DeadLock();
		deadLock.m1();
	}

}
