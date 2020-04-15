package com.nt.aspect;

import java.util.Arrays;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdivce {
	
	@Pointcut("execution(* com.nt.target.*.*(..))")
	public void myPointcut(){}
	
	@Around("myPointcut()")
	public Object  aroundLog(ProceedingJoinPoint pjp)throws Throwable{
		Object retVal=null;
		System.out.println("Entering into" +pjp.getSignature()+" with args"+ Arrays.toString(pjp.getArgs()));
		retVal=pjp.proceed();
		System.out.println("Exiting from" +pjp.getSignature()+" with args"+ Arrays.toString(pjp.getArgs()));
		return retVal;
    	}//method
	
	@Before("myPointcut()")
	public void  audit(JoinPoint jp)throws Throwable{
		System.out.println(jp.getSignature()+" with args"+ Arrays.toString(jp.getArgs())+"has come for executin at"+new Date());
	}
	
	@AfterReturning(value="myPointcut()",returning="result")
	public  void resultLog(JoinPoint jp,int result){
		System.out.println(jp.getSignature()+" with args"+ Arrays.toString(jp.getArgs())+"has generated result::"+result);
	}
	
	@AfterThrowing(value="myPointcut()",throwing="e")
	public  void exceptionLogger(JoinPoint jp,Exception e){
		System.out.println(jp.getSignature()+" with args"+ Arrays.toString(jp.getArgs())+"has raised exeception"+e); 
	}
	
	
}//class
