//SynchronizedDemo1.java
package com.nt.multithreading;

public class SynchronizedDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display_Demo display_Demo = new Display_Demo();
		MyThread1 myThread1 = new MyThread1(display_Demo);
		MyThread2 myThread2 = new MyThread2(display_Demo);
		myThread1.start();
		myThread2.start();
	}

}
