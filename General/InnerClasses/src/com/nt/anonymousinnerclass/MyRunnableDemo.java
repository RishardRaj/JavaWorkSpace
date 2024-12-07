//MyRunnableDemo.java
package com.nt.anonymousinnerclass;

public class MyRunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.println("ChildThread");
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("MainThread");
		}
	}

}
