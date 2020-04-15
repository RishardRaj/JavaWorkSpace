package com.nt.aspect;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMonitoringAdvice implements MethodInterceptor  {
      private long start=0;
      private long end=0; 
	public Object invoke(MethodInvocation invocation) throws Throwable {
		//seconday logic
		Object retVal=null;
		start=System.currentTimeMillis();  //pre logic
		retVal=invocation.proceed();  //calls target method
		end=System.currentTimeMillis();  //post logic
		System.out.println(invocation.getMethod().getName()+"with args  "+Arrays.toString(invocation.getArguments())+" has taken "+(end-start)+" ms");
		return retVal;
	}

}
