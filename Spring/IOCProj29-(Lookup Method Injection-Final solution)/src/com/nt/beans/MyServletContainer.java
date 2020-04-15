package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public abstract class MyServletContainer {
	
	public MyServletContainer() {
		System.out.println("MyServletcontainer::0-param constructor");
	}
	
	public void handle(String data){
	    RequestHandler handler=null;
		System.out.println("Container has recived request and hand over to RequestHandler");
	    //get Depedent bean
		handler=getRequestHandler();
	   handler.processRequest(data);
	   }

	   public abstract  RequestHandler getRequestHandler();




	}