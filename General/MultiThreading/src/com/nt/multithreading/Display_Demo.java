//Display_Demo.java
package com.nt.multithreading;

public class Display_Demo {
	public synchronized void displayn() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void displayc() {
		for (int i = 65; i <=90; i++) {
			System.out.println((char) i);
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
