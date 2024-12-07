//DeadLockDemo.java
package com.nt.thread;

public class DeadLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object train = new Object();
		Object compartment = new Object();
		BookTicket bookTicket = new BookTicket(train, compartment);
		CancelTicket cancelTicket = new CancelTicket(train, compartment);
		Thread thread1 = new Thread(bookTicket);
		Thread thread2 = new Thread(cancelTicket);
		thread1.start();
		thread2.start();
	}

}
