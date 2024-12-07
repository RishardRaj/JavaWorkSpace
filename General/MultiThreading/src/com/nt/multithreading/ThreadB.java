package com.nt.multithreading;

public class ThreadB extends Thread {
	int total = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			System.out.println("Child Thread Starts Execution");
			for (int i = 0; i < 100; i++) {
				total = total + i;
			}
			System.out.println("Child Thread Notifies Main Thread");
			this.notify();
			System.out.println("Child Thread Ends Execution");
		}
	}
}
