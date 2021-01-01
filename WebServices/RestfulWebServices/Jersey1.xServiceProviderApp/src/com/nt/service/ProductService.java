//ProductService.class
package com.nt.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/product")
public class ProductService {
	@POST
	@Path("/registerProduct")
	@Produces(MediaType.TEXT_PLAIN)
	// @Consumes(MediaType.APPLICATION_XML)
	public String registerProduct() {
		System.out.println("In Server :");
		return "Product Registration Completed Successfully";
	}
}
