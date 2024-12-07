//MyThread2.java
package com.nt.multithreading;

public class MyThread2 extends Thread {
	Display_Demo display_Demo;

	public MyThread2(Display_Demo display_Demo) {
		super();
		this.display_Demo = display_Demo;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		display_Demo.displayc();
	}
}
