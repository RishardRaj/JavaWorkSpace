//PhantomThreadDaemonManager.java
package com.helicalinsight.export;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Socket;
import java.net.UnknownHostException;

/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helicalinsight.efw.exceptions.DaemonServiceException;
import com.helicalinsight.efw.utility.JsonUtils;
*/
/**
 * This class has method calls which are there to start and stop the phantom
 * daemon service thread
 *
 * @author Rajasekhar M
 */
public class PhantomThreadDemonManager {
	//private static Logger logger = LoggerFactory.getLogger(PhantomThreadDemonManager.class);
	private static DaemonPhantomService daemonPhantom = DaemonPhantomService.getInstance();
	private static Thread phantomThread;

	public static void startDaemon() {
		if (phantomThread==null &&  daemonPhantom != null) {
			phantomThread = new Thread(daemonPhantom);
			phantomThread.setDaemon(true);
			if (!phantomThread.isAlive()) {
				phantomThread.start();
				System.out.println("Daemon Service Thread State1 " + phantomThread.getState().name());
				//logger.error("Daemon Service Thread State1 " + phantomThread.getState().name());
			} else {
				//throw new DaemonServiceException("Daemon Thread is already started");
				System.out.println("DaemonServiceException:Thread Already started");
			}
		}
	}

	public static void stopDaemon() {

		if (daemonPhantom != null) {
			daemonPhantom.stopPhantomService();
		} else {
			//throw new DaemonServiceException("Daemon Thread is already stopped");
		}
	}

	public static Integer getPhantomPort() {
		//return JsonUtils.getSettingsJson().optJSONObject("export").getInt("phantomPort");
		return 3000;
	}
	public static boolean isServiceActive() {

		String machineAddress = null;
		try {
			machineAddress = Inet4Address.getLocalHost().getHostAddress();
		} catch (UnknownHostException unknownHostException) {
			//logger.info("Failed to get IP address of server machine " + unknownHostException.getMessage());
			machineAddress = "localhost";
		}


		Socket socket = null;
		try {
			socket = new Socket(machineAddress, getPhantomPort());
			return true;
		} catch (IOException ioException) {
			System.out.println("Port busy");
			//logger.error("Invalid port number assigned for daemon service thread or port clashed " + port);
			return false;
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException exception) {
					System.out.println("Exception Occured While Closing the Socket");
				//	logger.info("Exception occured while closing the socket" + exception);
				}
			}
		}
	}
}
