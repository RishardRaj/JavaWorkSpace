package com.nt.beans;

public class MyServletContainer{
	 private RequestHandler handler;
	 
	  public MyServletContainer() {
		System.out.println("MyServletcontainer::0-param constructor");
	}
	 
	public void setHandler(RequestHandler handler){
	   this.handler=handler;
	  }
	public void handle(String data){
	   System.out.println("Container has recived request and hand over to RequestHandler");
	   handler.processRequest(data);
	   }
	}