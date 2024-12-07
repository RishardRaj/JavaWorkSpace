//DaemonServiceCheckComponent.java
package com.helicalinsight.export;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Socket;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helicalinsight.efw.serviceframework.IComponent;

import net.sf.json.JSONObject;

/**
 * This class is having utility method to check whether phantom js daemon
 * service is active or not
 * 
 * @author Rajasekhar M
 *
 */
public class DaemonServiceCheckComponent implements IComponent {
	private static Logger logger = LoggerFactory.getLogger(DaemonServiceCheckComponent.class);

	public static boolean isServiceActive() {

		String machineAddress = null;
		try {
			machineAddress = Inet4Address.getLocalHost().getHostAddress();
		} catch (UnknownHostException unknownHostException) {
			logger.info("Failed to get IP address of server machine " + unknownHostException.getMessage());
			machineAddress = "localhost";
		}

		Integer port = PhantomThreadDemonManager.getPhantomPort();

		Socket socket = null;
		try {
			socket = new Socket(machineAddress, port);
			return true;
		} catch (IOException ioException) {
			logger.error("Invalid port number assigned for daemon service thread or port clashed " + port);
			return false;
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException exception) {
					logger.info("Exception occured while closing the socket" + exception);
				}
			}
		}
	}

	@Override
	public boolean isThreadSafeToCache() {
		return true;
	}

	@Override
	public String executeComponent(String jsonFormData) {
		JSONObject formJson = JSONObject.fromObject(jsonFormData);
		String action = formJson.optString("action");
		JSONObject responseJson = new JSONObject();
		switch (action) {
		case "start":
			PhantomThreadDemonManager.startDaemon();
			responseJson.put("message", "Phantom service started successfully");
			break;
		case "stop":
			PhantomThreadDemonManager.stopDaemon();
			responseJson.put("message", "Phantom service stopped successfully");
			break;
		case "check":
			responseJson.put("running", isServiceActive());
			responseJson.put("message", "Phantom service status checked successfully");
			break;
		}
		return responseJson.toString();
	}

}
