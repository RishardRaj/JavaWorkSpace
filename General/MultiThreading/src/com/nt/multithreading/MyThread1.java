//MyThread.java
package com.nt.multithreading;

public class MyThread1 extends Thread {
	Display_Demo display_Demo;

	public MyThread1(Display_Demo display_Demo) {
		super();
		this.display_Demo = display_Demo;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		display_Demo.displayn();
	}
}
