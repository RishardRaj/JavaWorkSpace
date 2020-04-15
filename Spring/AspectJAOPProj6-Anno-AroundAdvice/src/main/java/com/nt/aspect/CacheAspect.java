package com.nt.aspect;

import java.util.Arrays;
import java.util.HashMap;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class CacheAspect {
	private HashMap<String,Object> cache=new HashMap<String,Object>();
	
	@Around("execution(* com.nt.target.IntrAmtCalculator.calcComp*(..))")
	public  Object caching(ProceedingJoinPoint pjp)throws Throwable{
		String key=null;
		Object retVal=null;
		//prepare targe method with args as the key
		key=pjp.getSignature()+Arrays.toString(pjp.getArgs());
		//check for the result in cache
		if(!cache.containsKey(key)){
			System.out.println("from target method");
			retVal=pjp.proceed();  //calls target method
			cache.put(key,((Float)retVal));
		}
		else{
			System.out.println("from cache");
			retVal=cache.get(key);
		}
		return retVal;
		
	}//method
}//class
