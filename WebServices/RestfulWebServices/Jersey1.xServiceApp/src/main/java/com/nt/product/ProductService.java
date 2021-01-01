//ProductService.java
package com.nt.product;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.nt.domain.Product;

@Path("product")
public class ProductService {

	@POST
	@Path("/xmlProductRequest")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_XML)
	public String xmlProductRequest(String productXML) {
		System.out.println(productXML);
		return "Product Registerd Successfully" + productXML;
	}

	@POST
	@Path("/xmlProduct")
	@Produces(MediaType.APPLICATION_XML)
	public Product xmlProduct(@MatrixParam("pId") int pid, @MatrixParam("pName") String pName,
			@MatrixParam("price") float price) {
		Product product = new Product();
		product.setpId(pid);
		product.setpName(pName);
		product.setPrice(price);
		System.out.println("Product Registerd Successfully" + product);
		return product;
	}

	@POST
	@Path("/jsonProduct")
	@Produces(MediaType.APPLICATION_JSON)
	public Product jsonProduct(@QueryParam("pId") int pid, @QueryParam("pName") String pName,
			@QueryParam("price") float price) {
		Product product = new Product();
		product.setpId(pid);
		product.setpName(pName);
		product.setPrice(price);
		System.out.println("Product Registerd Successfully" + product);
		return product;
	}

	@POST
	@Path("/htmlProduct")
	@Produces(MediaType.TEXT_HTML)
	public Product htmlProduct(@QueryParam("pId") int pid, @QueryParam("pName") String pName,
			@QueryParam("price") float price) {
		Product product = new Product();
		product.setpId(pid);
		product.setpName(pName);
		product.setPrice(price);
		System.out.println("Product Registerd Successfully" + product);
		return product;
	}

	@POST
	@Path("/textProduct")
	@Produces(MediaType.TEXT_PLAIN)
	public Product registerProduct(@QueryParam("pId") int pid, @QueryParam("pName") String pName,
			@QueryParam("price") float price) {
		Product product = new Product();
		product.setpId(pid);
		product.setpName(pName);
		product.setPrice(price);
		System.out.println("Product Registerd Successfully" + product);
		return product;
	}
}
