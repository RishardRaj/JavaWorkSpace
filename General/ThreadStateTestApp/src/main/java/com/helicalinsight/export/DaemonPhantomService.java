//DaemonPhantomService.java
package com.helicalinsight.export;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.List;

/**
 * The single instance of this runnable class object responsible for starting
 * daemon service thread
 * 
 * @author Rajasekhar M
 */
public class DaemonPhantomService implements Runnable {
	//private static final Logger logger = LoggerFactory.getLogger(DaemonPhantomService.class);
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
		//phantomLocation = ReportsProcessor.getPhantomLocation();
		phantomLocation="C:\\Users\\RAJ\\Desktop\\Thread Memory\\windows_phantomjs.exe";
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
		URL resource = getClass().getClassLoader().getResource("/HDIPhantomjs/server.js");

		if (resource != null) {
			//this.scriptLocation = resource.getFile();
			this.scriptLocation="C:\\Users\\RAJ\\Desktop\\Thread Memory\\server.js";
		} else {
			System.out.println("The file server.js script location is not found. ");
			//throw new ExportException("The file server.js script location is not found. ");
		}
		File screenShotFile = new File(scriptLocation);
		scriptLocation = screenShotFile.getAbsolutePath();
		return scriptLocation;
	}

	private void triggerPhantomProcess(List<String> command) {

		ProcessBuilder processBuilder = new ProcessBuilder(command);
		try {
			process = processBuilder.start();
		} catch (IOException e) {
			System.out.println("Problem during starting phantom service");
		//	logger.error("Problem during starting phantom service");
		}

	}

	public void stopPhantomService() {
		if (isRunnable) {
			process.destroyForcibly();
		} else {
			isRunnable = false;
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