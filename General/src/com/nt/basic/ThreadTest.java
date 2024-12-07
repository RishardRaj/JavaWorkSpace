//ThreadTest.java
package com.nt.basic;

public class ThreadTest {
	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("From Child Thread");
				}
			}
		};
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("From Main Thread");
		}
	}
}
