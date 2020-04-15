package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceMonitoringAspect {
		 private long start,end;
		public Object  monitor(ProceedingJoinPoint pjp)throws Throwable{
		 Object retVal;    
		start=System.currentTimeMillis();
		    retVal=pjp.proceed();
		 end=System.currentTimeMillis();
		  System.out.println(pjp.getSignature()+" with args "+Arrays.toString(pjp.getArgs())+" has taken "+(end-start)+"  ms for target method");
		  return retVal;
	   }//method
	}//class
