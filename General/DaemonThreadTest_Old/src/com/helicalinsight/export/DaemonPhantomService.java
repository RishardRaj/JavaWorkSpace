//DaemonPhantomService.java
package com.helicalinsight.export;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The single instance of this runnable class object responsible for starting
 * daemon service thread
 * 
 * @author Rajasekhar M
 */
public class DaemonPhantomService implements Runnable {
	// private static final Logger logger =
	// LoggerFactory.getLogger(DaemonPhantomService.class);
	private static volatile DaemonPhantomService daemonService = null;
	private static boolean isInstantiated = false;
	private static boolean isRunnable = false;
	private String scriptLocation;
	private String phantomLocation;
	private Process process;

	private DaemonPhantomService() {
		if (!isInstantiated) {
			isInstantiated = true;
		} else {
			throw new IllegalThreadStateException();
			
		}
	}

	public static DaemonPhantomService getInstance() {
		if (daemonService == null) {
			synchronized (DaemonPhantomService.class) {
				if (daemonService == null) {
					daemonService = new DaemonPhantomService();
				}
			}
		}
		return daemonService;
	}

	/**
	 * Creates an operating system process by invoking the phantom js.The
	 * phantom js creates the screen shot of the html from a file on the file
	 * system.
	 */
	@Override
	public void run() {
		System.out.println("DaemonPhantomService run() method" + Thread.currentThread().getName());
		// phantomLocation = ReportsProcessor.getPhantomLocation();
		String phantomFile = "windows_phantomjs.exe";
		phantomLocation = "D:\\Practices\\ReceivedApps\\Compressed\\Phantom\\" + phantomFile;
		scriptLocation = getScriptLocation();
		List<String> commands = buildCommand();
		triggerPhantomProcess(commands);
		isRunnable = true;
	}

	private List<String> buildCommand() {
		List<String> command = new ArrayList<String>();
		command.add(0, phantomLocation);
		command.add(1, scriptLocation);
		return command;
	}

	public String getScriptLocation() {
		/*
		 * URL resource =
		 * getClass().getClassLoader().getResource("/HDIPhantomjs/server.js");
		 * 
		 * if (resource != null) { this.scriptLocation = resource.getFile(); }
		 * else { throw new
		 * ExportException("The file server.js script location is not found. ");
		 * }
		 */
		scriptLocation = "D:\\Practices\\ReceivedApps\\Compressed\\Phantom\\server.js";
		File screenShotFile = new File(scriptLocation);
		scriptLocation = screenShotFile.getAbsolutePath();
		return scriptLocation;
	}

	private void triggerPhantomProcess(List<String> command) {
		System.out.println("triggerPhantomProcess called");
		ProcessBuilder processBuilder = new ProcessBuilder(command);
		System.out.println("ProcessBuilder instance constructed");
		try {
			processBuilder.redirectErrorStream(true);
			processBuilder.directory(new File("D:\\Practices\\ReceivedApps\\Compressed\\Phantom"));
			process = processBuilder.start();
			System.out.println("Process Started");

		} catch (IOException e) {
			System.out.println("Problem during starting phantom service");
			// logger.error("Problem during starting phantom service");
		}
	}

	public void stopPhantomService() {
		if (isRunnable) {
			System.out.println("Daemon Thread stopped successfully");
			process.destroyForcibly();
		} else {
			System.out.println("Daemon Thread stopped successfully already");
		}
	}

	public Object readResolve() {
		// For stopping duplicate instance creation through serialization
		return daemonService;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}