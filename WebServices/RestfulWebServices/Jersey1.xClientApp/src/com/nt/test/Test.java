package com.nt.test;

import java.io.StringWriter;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String url = "http://localhost:7685/Jersey1.xServiceProviderApp/product/registerProduct";*/
		String url = "http://localhost:9758/Jersey1.xServiceApp/product/xmlProduct";
		Client client = null;
		Builder builder = null;
		Product product = null;
		WebResource webResource = null;
		JAXBContext jaxbContext = null;
		Marshaller marshaller = null;
		StringWriter stringWriter = null;
		String productXml = null;
		ClientResponse clientResponse = null;
		String response = null;
		client = Client.create();
		webResource = client.resource(url);
		builder = webResource.type(MediaType.APPLICATION_XML);
		builder.accept(MediaType.TEXT_PLAIN);
		product = new Product();
		product.setId(53312);
		product.setName("RAJA");
		product.setPrice(343513.54f);
		try {
			jaxbContext = JAXBContext.newInstance(Product.class);
			marshaller = jaxbContext.createMarshaller();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stringWriter = new StringWriter();
		try {
			marshaller.marshal(jaxbContext, stringWriter);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		productXml = stringWriter.toString();
		clientResponse = builder.post(ClientResponse.class, productXml);
		response = clientResponse.getEntity(String.class);
		System.out.println("Client Status" + clientResponse.getStatus() + " " + clientResponse.getResponseStatus());
		System.out.println(response);
	}

}
