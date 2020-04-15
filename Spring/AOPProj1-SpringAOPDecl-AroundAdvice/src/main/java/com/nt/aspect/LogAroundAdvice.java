package com.nt.aspect;



import java.util.Arrays;
import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogAroundAdvice implements MethodInterceptor {
    private static Logger logger=Logger.getLogger(LogAroundAdvice.class);
    public LogAroundAdvice() {
     	 PropertyConfigurator.configure("src/main/java/com/nt/commons/log.properties");
	}
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retVal=0;
		Object args[]=null;
		logger.warn("Entering into "+invocation.getMethod().getName()+
				                 " with args"+Arrays.toString(invocation.getArguments())+
				                 "at "+new Date());
		//modify target method args
		args=invocation.getArguments();
		
		if(((Float)args[0])<10000)
			args[1]=(Float)args[1]-0.5f;
		
		if(((Float)args[0])<=0 || ((Float)args[1])<=0 ||((Float)args[2])<=0)
			throw new IllegalArgumentException("inputs must be +ve");

		retVal=invocation.proceed();
		   
		   logger.warn("Exited from "+invocation.getMethod().getName()+
	                 " with args"+Arrays.toString(invocation.getArguments())+
	                 "at "+new Date());
		   
		   if(((Float)retVal)>=5000)
			   retVal=((Float)retVal)+ ((Float)retVal)*0.05f;
		   
		   
   
		return retVal;
	}

}
