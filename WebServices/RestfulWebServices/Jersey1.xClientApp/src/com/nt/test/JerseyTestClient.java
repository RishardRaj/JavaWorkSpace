//JerseyTestClient.java
package com.nt.test;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class JerseyTestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://localhost:9758/Jersey1.xServiceApp/product/xmlProduct;pId=122;pName=Rajasekhar;price=2323.043f";
		WebResource webResource = null;
		ClientResponse clientResponse = null;
		Builder builder = null;
		// Create Client obj for consuming response from service provider
		Client client = Client.create();
		// Create WebResource with url
		webResource = client.resource(url);
		// Get the Builder object from web resource to specify acceptable mediaType format
		builder = webResource.accept(MediaType.APPLICATION_XML);
		clientResponse = builder.get(ClientResponse.class);
		// Convert response into json format
		String jsonResponse = clientResponse.getEntity(String.class);
		System.out.println(clientResponse.getStatus() + "----------" + clientResponse.getStatusInfo());
		System.out.println(jsonResponse);
	}

}
