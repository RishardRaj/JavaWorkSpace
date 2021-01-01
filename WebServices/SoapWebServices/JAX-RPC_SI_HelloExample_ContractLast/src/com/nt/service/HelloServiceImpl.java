//HelloServiceImpl.java
package com.nt.service;

import java.rmi.RemoteException;

public class HelloServiceImpl implements IHelloService {

	@Override
	public String wish(String name) throws RemoteException {
		// TODO Auto-generated method stub
		return "Hello" + name + "Welcome to JAX-RPC_SI";
	}// method

}// class