//ProductTest.java
package com.nt.consumes;

import java.io.StringWriter;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marshaller marshaller = null;
		JAXBContext jaxbContext = null;
		String url = "http://localhost:9758/Jersey1.xServiceApp/product/xmlProductRequest";
		// Create Client instance to consume service
		Client client = Client.create();
		// Create WebResource from url
		WebResource webResource = client.resource(url);
		// Builder instance to specify requested input data format and
		// acceptable response format
		Builder builder = webResource.type(MediaType.APPLICATION_XML);
		builder.accept(MediaType.TEXT_PLAIN);
		Product product = new Product();
		product.setpId(24252);
		product.setpName("Rajasekhar");
		product.setPrice(24242.42f);
		// JAXBContext instance to request service with xml format data
		try {
			jaxbContext = JAXBContext.newInstance(Product.class);
			marshaller = jaxbContext.createMarshaller();
			StringWriter stringWriter = new StringWriter();
			marshaller.marshal(product, stringWriter);
			String productXML = stringWriter.toString();
			System.out.println("Product Xml" + productXML);
			ClientResponse clientResponse = builder.post(ClientResponse.class, productXML);
			String response = clientResponse.getEntity(String.class);
			System.out.println(clientResponse.getStatus() + "----------------" + clientResponse.getStatusInfo());
			System.out.println(response);
		} catch (JAXBException jaxbException) {
			// TODO Auto-generated catch block
			jaxbException.printStackTrace();
		}

	}

}