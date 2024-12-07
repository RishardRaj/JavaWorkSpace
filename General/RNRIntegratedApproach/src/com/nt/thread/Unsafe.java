//Unsafe.java
package com.nt.thread;

public class Unsafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reserve reserve = new Reserve(1);
		// attach first thread to object
		Thread thread1 = new Thread(reserve);
		Thread thread2 = new Thread(reserve);
		// keep names for the persons
		thread1.setName("First Person");
		thread2.setName("Second Person");
		thread1.start();
		thread2.start();
	}

}
