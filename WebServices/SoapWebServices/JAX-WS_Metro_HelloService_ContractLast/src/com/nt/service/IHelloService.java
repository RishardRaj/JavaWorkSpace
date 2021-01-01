//IHelloService.java
package com.nt.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.java.soap.webservices.metroimpl")
public interface IHelloService {
	@WebMethod
	public String sayHelloService(String name);
}
