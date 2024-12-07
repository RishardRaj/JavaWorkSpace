//B.java
package com.nt.deadlock;

public class B {
	public  void d2(A a) {
		System.out.println("Thread t2 starts execution d2() method");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Thread t2 trying to call A's last() method");
			a.last();
		}
	}
	public void last(){
		System.out.println("Inside B,this is last() method");
	}
}
