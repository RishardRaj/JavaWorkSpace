//Test.java
package com.nt.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.nt.proxy.GlobalWeather;
import com.nt.proxy.GlobalWeatherSoap;
import com.nt.proxy.GlobalWeather_Impl;
import com.nt.proxy.Hello;
import com.nt.proxy.Hello_Impl;
import com.nt.proxy.IHelloService;

public class Test {

	public static void main(String[] args) throws ServiceException, RemoteException {
		// TODO Auto-generated method stub
		GlobalWeather globalWeather = null;
		GlobalWeatherSoap globalWeatherSoap = null;
		String result, result1 = null;
		// create wsdl object
		globalWeather = new GlobalWeather_Impl();
		// get SEI implementation obj
		globalWeatherSoap = globalWeather.getGlobalWeatherSoap();
		result = globalWeatherSoap.getCitiesByCountry("US");
		result1 = globalWeatherSoap.getWeather("Tamworth Airport", "US");
		System.out.println(result);
		System.out.println(result1);
	}

}
