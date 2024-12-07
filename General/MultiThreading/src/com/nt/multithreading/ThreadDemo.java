package com.nt.multithreading;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//create child Thread
		//Thread childThread=Thread.currentThread();
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