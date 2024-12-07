//BookTicket.java
package com.nt.thread;

public class BookTicket extends Thread {
	Object train, compartment;

	public BookTicket(Object train, Object compartment) {
		// TODO Auto-generated constructor stub
		this.train = train;
		this.compartment = compartment;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// lock on train
		synchronized (train) {
			System.out.println("BookTicket locked on train");
			try {
				Thread.sleep(150);
			} catch (InterruptedException interruptedException) {
				// TODO Auto-generated catch block
				interruptedException.printStackTrace();
			}
			System.out.println("BookTicket now waiting to lock on compartment........");
			// Lock on compartment
			synchronized (compartment) {
				System.out.println("BookTicket locked on compartment");
			}

		}
	}// run()
}// class
