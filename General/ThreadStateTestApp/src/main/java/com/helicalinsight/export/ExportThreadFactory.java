//ExportThreadFactory.java
package com.helicalinsight.export;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helicalinsight.efw.framework.FactoryMethodWrapper;
import com.helicalinsight.efw.utility.JsonUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * This is Factory class for threads which is able to switch threads to download
 * reports as an attachments on the file system.
 * 
 * @author Rajasekhar M
 *
 */
public class ExportThreadFactory {
	private static Logger logger=LoggerFactory.getLogger(ExportThreadFactory.class);
	public static List<String> handleThreads(JSONObject settings) {
		logger.error("JSONSettings "+settings);
		PhantomExportService phantomServiceManager = null;
		PhantomExportService httpExportServiceHandler = null;
		List<String> stringList = null;
		System.out.println("Settings " + settings);
		JSONArray printModes = JsonUtils.getSettingsJson().optJSONObject("export").optJSONArray("defaultPrintingMode");
		JSONObject defaultMode = printModes.getJSONObject(0);
		if (defaultMode.getString("@default").equalsIgnoreCase("true")) {
			phantomServiceManager = (PhantomExportService) FactoryMethodWrapper
					.getUntypedInstance(defaultMode.getString("@class"));
			if (phantomServiceManager != null) {
				stringList = phantomServiceManager.handlePhantomjs(settings);
			}
		} else {
			JSONObject daemonMode = printModes.getJSONObject(1);
			httpExportServiceHandler = (PhantomExportService) FactoryMethodWrapper
					.getUntypedInstance(daemonMode.getString("@class"));
			if (httpExportServiceHandler != null) {
				stringList = httpExportServiceHandler.handlePhantomjs(settings);
			}
		}
		
		return stringList;
	}
}
