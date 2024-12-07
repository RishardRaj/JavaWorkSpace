//DaemonServiceCheckComponent.java
package com.helicalinsight.export;

/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helicalinsight.efw.serviceframework.IComponent;

import net.sf.json.JSONObject;
*/
/**
 * This class is having utility method to check whether phantom js daemon
 * service is active or not
 * 
 * @author Rajasekhar M
 *
 */
public class DaemonServiceCheckComponent /*implements IComponent*/ {
	// private static Logger logger =
	// LoggerFactory.getLogger(DaemonServiceCheckComponent.class);

	/*@Override
	public boolean isThreadSafeToCache() {
		return true;
	}*/

	public static void executeComponent(String jsonFormData) {
		// JSONObject formJson = JSONObject.fromObject(jsonFormData);
		// String action = formJson.optString("action");
		// JSONObject responseJson = new JSONObject();
		switch (jsonFormData) {
		case "start":
			PhantomThreadDemonManager.startDaemon();
			System.out.println("PhantomThreadDaemonManager stopDaemon() method invoked");
			//responseJson.put("message", "Phantom service started successfully");
			break;
		case "stop":
			PhantomThreadDemonManager.stopDaemon();
			System.out.println("PhantomThreadDaemonManager stopDaemon() method invoked");
			//responseJson.put("message", "Phantom service stopped successfully");
			break;
		case "check":
			PhantomThreadDemonManager.isServiceActive();
			System.out.println("PhantomThreadDaemonManager stopDaemon() method invoked");
			//responseJson.put("running", isServiceActive());
			//responseJson.put("message", "Phantom service status checked successfully");
			break;
		}
	}

}
