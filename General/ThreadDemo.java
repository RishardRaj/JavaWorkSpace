//ThreadDemo.java
package com.nt.multithreading;

class MyThread extends Thread {
	static Thread childThread=Thread.currentThread();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			childThread.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child Thread");

		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		MyThread myThread=new MyThread();
		//Start main thread
		myThread.start();
		myThread.join();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main Thread");
		}//for
	}//main
}// class