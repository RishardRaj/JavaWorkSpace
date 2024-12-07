//SynchronizedDemo.java
package com.nt.multithreading;

public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display display = new Display();
		MySynchronizedThread mySynchronizedThread = new MySynchronizedThread(display, "Raj");
		MySynchronizedThread mySynchronizedThread2 = new MySynchronizedThread(display, "Ravi");
		mySynchronizedThread.start();
		mySynchronizedThread2.start();

	}

}
