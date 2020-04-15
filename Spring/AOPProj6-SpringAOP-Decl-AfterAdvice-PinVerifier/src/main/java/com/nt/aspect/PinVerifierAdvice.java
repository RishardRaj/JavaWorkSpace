package com.nt.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class PinVerifierAdvice implements AfterReturningAdvice {

	public void afterReturning(Object retVal, Method method, Object[] args, Object target) throws Throwable {
        if(((Integer)retVal)<1000 || ((Integer)retVal)>10000)
        	throw new IllegalArgumentException(" Invalid pin number is generated");
	}//method
}//class
