//Reserve.java
package com.nt.thread;

public class Reserve implements Runnable {
	public int available = 1;
	public int wanted;

	// Accept wanted berths at runtime
	public Reserve(int i) {
		// TODO Auto-generated constructor stub
		wanted = i;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// display available berths
		System.out.println("Available Beths " + available);
		if (available >= wanted) {
			// get the Name of the passenger
			String name = Thread.currentThread().getName();
			// allot berth to him
			System.out.println(wanted + "Berths are reserved for " + name);
			try {
				Thread.sleep(1500);
				available = available - wanted;
			} catch (InterruptedException interruptedException) {
				// TODO Auto-generated catch block
				interruptedException.printStackTrace();
			}
		} else {
			System.out.println("Sorry,No Berths");
		}
	}

}
