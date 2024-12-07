//MyThreadTest.java
package com.helicalinsight.thread;

public class MyThreadTest {
	private static MyThread myThread = MyThread.getInstance();

	public static void main(String[] args) {
		MyThreadManager.startDaemon();
		MyThreadManager.stopDaemon();
		//MyThreadManager.startDaemon();
		MyThreadManager.checkStatus();
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}

	}
}