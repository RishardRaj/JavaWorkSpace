//SynchronizedDemo.java
package com.nt.multithreading;

public class MySynchronizedThread extends Thread {
	Display display;
	String name;

	public MySynchronizedThread(Display display, String name) {
		super();
		this.display = display;
		this.name = name;
	}

	public void run() {
		display.wish(name);
	}

}
