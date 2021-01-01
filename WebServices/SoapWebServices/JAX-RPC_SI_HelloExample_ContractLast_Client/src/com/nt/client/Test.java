//Test.java
package com.nt.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.nt.proxy.Hello;
import com.nt.proxy.Hello_Impl;
import com.nt.proxy.IHelloService;

public class Test {

	public static void main(String[] args) throws ServiceException, RemoteException {
		// TODO Auto-generated method stub
		Hello hello = null;
		String result = null;
		// create wsdl object
		hello = new Hello_Impl();

		// get SEI implementation obj
		IHelloService iHelloService = hello.getIHelloServicePort();
		result = iHelloService.wish("RAJASEKHAR RXj");
		System.out.println(result);
	}

}
