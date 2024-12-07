//MyRunnableDemo1.java
package com.nt.anonymousinnerclass;

public class MyRunnableDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.println("childThread");
				}

			}
		}).start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}// main
}// class
