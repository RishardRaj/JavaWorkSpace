//ThreadSleep.java
package com.nt.multithreading;

public class ThreadSleep extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread Sleeping State");
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ChildThread got Interrupted");
		}
	}
}
