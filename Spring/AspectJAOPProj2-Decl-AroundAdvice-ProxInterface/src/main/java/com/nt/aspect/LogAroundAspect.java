package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAroundAspect {

	public Object log(ProceedingJoinPoint pjp)throws Throwable{
		Object retVal=null;
		Object args[]=null;
		System.out.println("Entering into "+pjp.getSignature()+"  with args"+Arrays.toString(pjp.getArgs()));
		//modify target method arg values 
		args=pjp.getArgs();
		if((Float)args[0]<10000)
			args[1]=((Float)args[1])-0.5f;
			//call taget method
		retVal=pjp.proceed(args);
			
		System.out.println("Exiting from "+pjp.getSignature()+"  with args"+Arrays.toString(pjp.getArgs()));
		return retVal;
	}//log
}//class
