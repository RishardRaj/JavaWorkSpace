//BookServiceClient.java
package com.nt.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;

import com.nt.domain.Book;
import com.nt.dto.ResponseDTO;
import com.nt.util.JerseyUtil;

public class BookServiceClient {
	public ResponseDTO saveBookDetails(Book book) {
		String url = "http://localhost:2030/Jersey2.x_BookServiceProvider/books/registerBook";
		// Jersey 2.x Client Code
		Client client = null;
		WebTarget webTarget = null;
		Builder builder = null;
		Response response = null;
		ResponseDTO responseDTO = null;
		String jsonResponse = null;
		// Create Client Obj to get response
		client = ClientBuilder.newClient();
		/*
		 * client=ClientBuilder.newClient(new
		 * ClientConfig().register(LoggingFilter.class));
		 */
		// Specify taget Resource using WebTarget
		webTarget = client.target(url);
		// Specify request media type and response media type
		builder = webTarget.request(MediaType.APPLICATION_JSON);
		builder.accept(MediaType.APPLICATION_JSON);
		// Get response from the service Provider
		response = (Response) builder.post(Entity.entity(book, MediaType.APPLICATION_JSON), Response.class);
		jsonResponse = response.readEntity(String.class);
		responseDTO = JerseyUtil.JSONToJavaObjectConversion(jsonResponse, ResponseDTO.class);
		return responseDTO;
	}// method
}// class
