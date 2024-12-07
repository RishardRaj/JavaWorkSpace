//SynchronizedBlockDemo.java
package com.nt.multithreading;

public class SynchronizedBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizedBlock synchronizedBlock = new SynchronizedBlock();
		MyThread1_SBlock myThread1_SBlock = new MyThread1_SBlock(synchronizedBlock, "RAJ");
		MyThread2_SBlock myThread2_SBlock = new MyThread2_SBlock(synchronizedBlock, "RAVI");
		myThread1_SBlock.start();
		myThread2_SBlock.start();
	}

}
