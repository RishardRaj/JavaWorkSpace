//ThreadA.java
package com.nt.multithreading;

public class ThreadA extends Thread {
	public static void main(String[] args) {
		ThreadB threadB = new ThreadB();
		threadB.start();
		synchronized (threadB) {
			System.out.println("Main Thread Calling wait() method");
			try {
				threadB.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Main Thread got Notification");
			System.out.println(threadB.total);
		}
	}
}
