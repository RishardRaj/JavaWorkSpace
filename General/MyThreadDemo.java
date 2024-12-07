//MyThreadDemo.java
package com.nt.anonymousinnerclass;

public class MyThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("ChildThread");
				} // run()
			}// for
		};
		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("MainThread");
		}
	}// main

}// class
