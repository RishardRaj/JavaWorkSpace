package com.nt.aspect;



import java.util.Arrays;
import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class LogAroundAdvice implements MethodInterceptor {
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retVal=0;
		System.out.println("Entering into "+invocation.getMethod().getName()+
				                 " with args"+Arrays.toString(invocation.getArguments())+
				                 "at "+new Date());
		retVal=invocation.proceed();
		   
		  System.out.println("Exiting from "+invocation.getMethod().getName()+
	                 " with args"+Arrays.toString(invocation.getArguments())+
	                 "at "+new Date());
		return retVal;
	}

}
