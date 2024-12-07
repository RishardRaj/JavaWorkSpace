//MyThreadManager.java
package com.helicalinsight.thread;

import java.net.Inet4Address;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyThreadManager {
	private static MyThread myThead = MyThread.getInstance();
	private static Thread thread = new Thread(myThead);
	private static boolean isStarted = false;
	static String ip;

	private static String getHostAddress() {
		try {
			return Inet4Address.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static void startDaemon() {

		if (!(thread.isAlive() && isServiceActive(getHostAddress(), 3000))) {
			thread.start();
			isStarted = true;
			System.out.println("Thread is started successfully");
		} else {
			System.out.println("Thread is already running in background");
		}
	}

	public static void stopDaemon() {
		if (isStarted && isServiceActive(getHostAddress(), 3000)) {
			thread.stop();
			System.out.println("Thread is stopped successfully");
		} else {
			System.out.println("Thread is already stopped");
		}
	}

	public static void checkStatus() {
		if (thread.isAlive() && isServiceActive(getHostAddress(), 3000)) {
			System.out.println("Thread is already running");
		} else {
			thread.start();
			System.out.println("Thread started successfully by checking status of it");
		}
	}

	public static boolean isServiceActive(String host, int port) {
		Socket s = null;
		try {
			s = new Socket(host, port);
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (Exception e) {
				}
		}
	}
}
