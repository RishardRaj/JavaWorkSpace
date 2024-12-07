//CancelTicket.java
package com.nt.thread;

public class CancelTicket extends Thread {
	Object train, compartment;

	public CancelTicket(Object train, Object compartment) {
		this.train = train;
		this.compartment = compartment;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (train) {
			System.out.println("CancelTicket now locked on train");
			try {
				Thread.sleep(200);
			} catch (InterruptedException interruptedException) {
				// TODO Auto-generated catch block
				interruptedException.printStackTrace();
			}
			System.out.println("CancelTicket now waiting to lock on compartment....");
			synchronized (train) {
				System.out.println("CancelTicket now locked on compartment");
			}
		}
	}
}
