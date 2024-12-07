//ThreadSleepDemo.java
package com.nt.multithreading;

public class ThreadSleepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSleep threadSleep=new ThreadSleep();
		threadSleep.start();
		threadSleep.interrupt();
		System.out.println("End Of Main");
		}

}
