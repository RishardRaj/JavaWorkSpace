package com.nt.aspect;

import java.io.FileWriter;
import java.io.Writer;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class AuditingAdvice implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {
	    Writer writer=null;
		System.out.println("target method name"+method.getName());
	  System.out.println("target class name "+target.getClass());
	  System.out.println("target method args"+Arrays.toString(args));
	  
	  if((Integer)args[0]<0)
		  args[0]=(Integer)args[0]*-1;
	  
	   //write audit info to log file
	  writer=new FileWriter("E:/spring/auditLog.txt",true);
	  writer.write(args[0]+" order has come for approval  at "+new Date()+" \n");
		writer.flush();
		writer.close();
	}//before(-,-,-)
}//class
