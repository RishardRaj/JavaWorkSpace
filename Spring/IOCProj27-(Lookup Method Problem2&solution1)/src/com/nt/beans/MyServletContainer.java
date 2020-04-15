package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyServletContainer {
	private String beanId;
	
	  public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	  

	public MyServletContainer() {
		System.out.println("MyServletcontainer::0-param constructor");
	}
	
	public void handle(String data){
	   ApplicationContext ctx=null;
	   RequestHandler handler=null;
		System.out.println("Container has recived request and hand over to RequestHandler");
	    ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	    //get Depedent bean
	    handler=ctx.getBean(beanId,RequestHandler.class);
	   handler.processRequest(data);
	   }


	}