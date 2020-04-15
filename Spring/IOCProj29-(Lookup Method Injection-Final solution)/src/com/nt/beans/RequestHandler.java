package com.nt.beans;
public class RequestHandler{
	 private static int count=0;
	 public RequestHandler() {
		System.out.println("RequestHandler::0-param constructor");
	}
	 public void processRequest(String data){
		 count++;
	   System.out.println("Handing request no:"+count+" with data"+data);
	  } 
	}