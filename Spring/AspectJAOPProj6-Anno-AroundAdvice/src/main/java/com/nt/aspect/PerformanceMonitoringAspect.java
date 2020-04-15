package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class PerformanceMonitoringAspect {
		 private long start,end;
		 @Around("execution(* com.nt.target.IntrAmtCalculator.*(..))")
		public Object  monitor(ProceedingJoinPoint pjp)throws Throwable{
		 Object retVal;    
		start=System.currentTimeMillis();
		    retVal=pjp.proceed();
		 end=System.currentTimeMillis();
		  System.out.println(pjp.getSignature()+" with args "+Arrays.toString(pjp.getArgs())+" has taken "+(end-start)+"  ms for target method");
		  return retVal;
	   }//method
	}//class
