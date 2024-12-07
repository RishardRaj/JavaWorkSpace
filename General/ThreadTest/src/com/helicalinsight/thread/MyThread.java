//MyThread.java
package com.helicalinsight.thread;

public class MyThread implements Runnable {
	private static boolean isInstantiated = false;
	private static volatile MyThread myThread;

	private MyThread() {
		// TODO Auto-generated constructor stub
		if (!isInstantiated) {
			isInstantiated = true;
		}
		System.out.println("MyThread 0-param Constructor");
	}

	public static MyThread getInstance() {
		if (myThread == null) {
			synchronized (MyThread.class) {
				if (myThread == null) {
					myThread = new MyThread();
				}
			}
		}
		return myThread;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException();
	}

	public Object readResolve() {
		return myThread;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
