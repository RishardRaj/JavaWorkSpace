//Test.java
package com.nt.deadlock;

import com.nt.daemon.MyThread;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().isDaemon());
		/*
		 * We cannot change the nature of Main Thread as Daemon because it is
		 * already started by JVM
		 */
		// Thread.currentThread().setDaemon(true);
		MyThread myThread = new MyThread();
		myThread.setDaemon(true);
		System.out.println(myThread.isDaemon());
		myThread.start();
	}

}
