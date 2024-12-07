//PhantomExportService.java
package com.helicalinsight.export;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helicalinsight.efw.utility.JsonUtils;

import net.sf.json.JSONObject;

/**
 * One of the extended class from PhantomExportService abstract class
 * responsible for requesting phantom daemon service with url through HttpClient
 * calls
 * 
 * @author Rajasekhar M
 *
 */
public class HttpExportServiceHandler extends PhantomExportService {
	private static Logger logger = LoggerFactory.getLogger(HttpExportServiceHandler.class);

	@Override
	public List<String> handlePhantomjs(JSONObject settings) {
		logger.error("HttpExportServiceHandler handlePhantomJS() method");

		logger.error("domain" + settings.getString("domain"));
		logger.error("format" + settings.getString("format"));
		logger.error("url" + settings.getString("reportSourceUri"));
		logger.error("report name" + settings.getString("destinationFile"));

		// Create an instance of HttpClient.
		CloseableHttpClient httpClient = HttpClients.createDefault();

		
		URI uri = null;
		URIBuilder uriBuilder = new URIBuilder();
		uriBuilder.setScheme("http").setHost("localhost").setPort(getPhantomPort()).setPath("/");
		//uriBuilder.setParameter("formData", settings.toString());
		// uriBuilder.setPath(settings.getString("reportSourceUri"));

		// uriBuilder.setFragment(settings.getString("destinationFile"));
		try {
			uri = uriBuilder.build();
		} catch (URISyntaxException uriSyntaxException) {
			logger.info("requesting phantom daemon service with Malformed uri " + uriSyntaxException.getMessage());
		}
		HttpPost postMethod = new HttpPost(uri);
		StringEntity requestEntity = new StringEntity(settings.toString(), ContentType.APPLICATION_JSON);
		postMethod.setEntity(requestEntity);
		HttpResponse response=null;
		try {
		response= httpClient.execute(postMethod);
		} catch (IOException ioException) {
			logger.info("Exception raised while getting uri for phantom" + ioException.getStackTrace());
		} catch (Exception exception) {
			logger.info("Exception raised while getting uri for phantom" + exception.getStackTrace());
		}
		HttpEntity responseEntity = response.getEntity();
		String responseText=null;
		try {
				if(responseEntity!=null) {
				responseText = EntityUtils.toString(responseEntity);
			}
				} catch (ParseException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		logger.info("Response"+responseText);
		List<String> list=new ArrayList<>();
		list.add(responseText);
		list.add("");
		// return (HttpServletResponse) response;
		return list;
	}

	public static Integer getPhantomPort() {
		return JsonUtils.getSettingsJson().optJSONObject("export").getInt("phantomPort");
	}

}
