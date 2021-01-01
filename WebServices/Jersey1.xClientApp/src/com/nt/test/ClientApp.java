//ClientApp.java
package com.nt.test;

import java.io.File;
import java.io.StringWriter;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.nt.domain.Product;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class ClientApp {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		WebResource webResource = null;
		Builder builder = null;
		Product product = null;
		Marshaller marshaller = null;
		JAXBContext jaxbContext = null;
		File file = null;
		StringWriter stringWriter = null;
		String productXML = null;
		ClientResponse clientResponse = null;
		
		String response = null;
		String url = "http://localhost:7498/Jersey1.xBasicsApps/products/getProducts";
		// Create Client Obj to test the application
		Client client = Client.create();
		// Create Resource class obj having this url
		webResource = client.resource(url);
		// Specify request media type for resource classmave
		builder = webResource.type(MediaType.APPLICATION_XML);
		// Specify response media type for resource class
		builder.accept(MediaType.TEXT_PLAIN);
		// Convert java object into xml(Marshalling) using JAXB context Object
		product = new Product();
		product.setPid(101);
		product.setPname("Keyboard");
		product.setPrice(1000.0f);
		// Create JAXB context Obj havig entity class as argument
		jaxbContext = JAXBContext.newInstance(Product.class);

		/*
		 * // java obj to xml conversion marshaller =
		 * jaxbContext.createMarshaller(); file = new File("Product.xml");
		 * marshaller.marshal(product, file);
		 */
		// write Resource class response as String
		stringWriter = new StringWriter();
		marshaller = jaxbContext.createMarshaller();
		marshaller.marshal(product, stringWriter);
		// to write response in String format
		productXML = stringWriter.toString();
		clientResponse = builder.post(ClientResponse.class, productXML);
		response = clientResponse.getEntity(String.class);
		System.out.println(clientResponse.getStatus() + "===========" + clientResponse.getStatusInfo());
		// print resource class response
		System.out.println(response);
	}// method

}// class
