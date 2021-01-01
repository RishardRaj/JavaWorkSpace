//ProductService.java
package com.nt.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.nt.domain.Product;

@Path("products")
public class ProductService {
	@GET
	@Path("/xmlProduct")
	@Produces(MediaType.APPLICATION_XML)
	public Product searchProductInXml(@QueryParam("pid") Integer pid) {
		Product product = null;
		product = new Product();
		System.out.println("Entered Into Search product xml");
		product.setProductId(pid);
		product.setProductName("KeyBoard");
		product.setProductPrice(10000);
		return product;
	}

	@POST
	@Path("/jsonProduct")
	@Produces(MediaType.APPLICATION_JSON)
	public Product searchProductInJSON(@QueryParam("pid") Integer pid) {
		Product product = null;
		product = new Product();
		product.setProductId(pid);
		product.setProductName("KeyBoard");
		product.setProductPrice(10000);
		return product;
	}

	@GET
	@Path("/htmlProduct")
	@Produces(MediaType.APPLICATION_XHTML_XML)
	public Product searchProductInHTML(@QueryParam("pid") Integer pid) {
		Product product = null;
		product = new Product();
		product.setProductId(pid);
		product.setProductName("KeyBoard");
		product.setProductPrice(10000);
		return product;
	}

	@GET
	@Path("/textProduct")
	@Produces(MediaType.TEXT_PLAIN)
	public Product searchProductInText(@QueryParam("pid") Integer pid) {
		Product product = null;
		product = new Product();
		product.setProductId(pid);
		product.setProductName("KeyBoard");
		product.setProductPrice(10000);
		return product;
	}
}
