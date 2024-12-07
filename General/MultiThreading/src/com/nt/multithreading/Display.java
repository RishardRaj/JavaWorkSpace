//Display.java
package com.nt.multithreading;

public class Display {
	public synchronized void wish(String name) {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Hi" + name);
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
