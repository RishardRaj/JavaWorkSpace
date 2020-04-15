package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class CommonExceptionLogger {
	
	public void exceptionLogger(JoinPoint jp,Exception ex){
		System.out.println("target class name:"+jp.getTarget().getClass());
		System.out.println("target method name:"+jp.getSignature());
		System.out.println("taget method arguments "+Arrays.toString(jp.getArgs()));
		
		System.out.println(ex.toString()+"  Exception is raised in"+jp.getSignature()+"  with args"+Arrays.toString(jp.getArgs()));
		throw new InValidOperationException(ex.getMessage());
	}

}
