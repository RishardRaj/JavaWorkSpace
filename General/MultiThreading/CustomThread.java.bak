//CustomThread.jaava
package com.nt.multithreading;

public class CustomThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomThread customThread=null;
		customThread=new CustomThread();
		customThread.start();
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
		}
	}

}
