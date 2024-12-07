package com.nt.general;

class MultiThreadingDemo implements Runnable{
/*public void start(){
	super.start();
	System.out.println("Start Method");
}//start()*/
public void run(){
	for(int i=0;i<10;i++){
		System.out.println("Child Thread");
	}//for
}//run()
}//class

public class MultiThreadingTest{
	public static void main(String[] args)  
	{
		System.out.println(Thread.currentThread().getName());	
		MultiThreadingDemo multiThreadingDemo=new MultiThreadingDemo();
		Thread thread=new Thread(multiThreadingDemo);
		thread.start();
		System.out.println(thread.getName());
		for(int i=0;i<10;i++){
		System.out.println("Main Thread!");
		}//for
	}//main
}//class
