//ThreadTestDemo.java

package com.nt.basic;

public class ThreadTestDemo {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.println("From Child Thread");
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("From Main Thread");
		}
	}
}
