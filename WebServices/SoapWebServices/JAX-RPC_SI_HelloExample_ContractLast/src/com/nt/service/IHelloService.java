//IHello.java
package com.nt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHelloService extends Remote {
	public String wish(String name) throws RemoteException;
}//interface
