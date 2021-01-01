package com.nt.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloServiceImpl implements IHelloService {

	@Override
	@WebMethod
	public String sayHelloService(String name) {
		// TODO Auto-generated method stub
		return "Hello " + name + "Welcome to JAX-WS_Metro Impl";
	}// method
}// class
