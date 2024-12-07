//SynchronizedBlock.java
package com.nt.multithreading;

public class SynchronizedBlock {
	public void wish(String name) {
		;
		;
		;
		;
		;
		;// 1 Lakh Lines of code
		synchronized (this) {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Hi" + name);
			}
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			;
			;
			;
			;
			;
			;// 1 Lakh Lines of code
		}
	}
}