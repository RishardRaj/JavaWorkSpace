//ProductService.java
package com.nt.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.domain.Product;
import com.sun.research.ws.wadl.Application;

@Path("/products")
public class ProductService {

	@GET
	@Path("/getProducts")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public Product searchProducts() {
		Product product = null;
		product = new Product();
		product.setPid(100);
		product.setPname("Keyboard");
		product.setPrice(1000.0f);
		return product;
	}/// method

}// class
