//ProductService.java
package com.nt.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.research.ws.wadl.Application;

@Path("/products")
public class ProductService {

	@POST
	@Path("/getProducts")
	@Produces(MediaType.TEXT_PLAIN)
	public String searchProducts() {
		return "Product details saved Successfully";
	}/// method

}// class
