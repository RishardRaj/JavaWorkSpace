//MyThread2_SBlock.java
package com.nt.multithreading;

public class MyThread2_SBlock extends Thread {
	SynchronizedBlock synchronizedBlock;
	String name;

	public MyThread2_SBlock(SynchronizedBlock synchronizedBlock, String name) {
		super();
		this.synchronizedBlock = synchronizedBlock;
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronizedBlock.wish(name);
	}
}
