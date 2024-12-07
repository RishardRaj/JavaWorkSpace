package com.helicalinsight.export;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.support.ExecutorChannelInterceptor;

import com.helicalinsight.efw.utility.JsonUtils;

import net.sf.json.JSONObject;

/**
 * The instance of this class manages service calls of thread which generates
 * the pdf or png or jpeg formats on the file system.
 *
 * @author Rajasekhar M
 * @since 1.0
 */
public class PhantomServiceManager {
	private final static Logger logger = LoggerFactory.getLogger(PhantomServiceManager.class);
	private static ExecutorService executor = Executors.newFixedThreadPool(getPoolSize());

	public static List<String> handlePhantomjs(String phantomLocation, String scriptLocation, String reportSourceURI,
			String destinationFile, JSONObject settings) {
		logger.error("Executor Obj" + executor);

		PhantomJS phantomJS = new PhantomJS(phantomLocation, scriptLocation, reportSourceURI, destinationFile,
				settings);
		List<String> threadStList = new ArrayList<>();
		logger.info("CurrentThread = " + Thread.currentThread() + ". Starting phantom-thread "
				+ "to generate the report format.");
		executor.execute(phantomJS);
		try {
			executor.awaitTermination(50000,TimeUnit.SECONDS);
			/*synchronized (phantomJS) {
				executor.wait();
			}*/
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String inputString = phantomJS.getInputString();
		System.out.println("Input String " + inputString);
		threadStList.add(inputString);
		String errorString = phantomJS.getErrorString();
		threadStList.add(errorString);
		System.out.println("Error String " + errorString);
		return threadStList;
	}

	public static int getPoolSize() {
		return JsonUtils.getSettingsJson().optJSONObject("export").getInt("phanmtomPoolSize");
	}
}