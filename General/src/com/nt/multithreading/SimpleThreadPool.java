//MyThread.java
package com.nt.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author RAJ
 *
 */

public class SimpleThreadPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		Runnable worker = null;
		for (int i = 0; i < 10; i++) {
			worker = new WorkerThread("" + i);
			Thread thread = new Thread(worker);
			executor.execute(thread);
		}
		/*try {
			//thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println(Thread.currentThread().getName());
		executor.shutdown();
		System.out.println("Second Thread "+Thread.currentThread().getName());
		/*while (!executor.isTerminated()) {
		System.out.println("hai how are you");
		}*/
		System.out.println("Finished all threads");
	}
}
