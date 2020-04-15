package com.nt.aspect;

import java.util.Arrays;
import java.util.HashMap;

import org.aspectj.lang.ProceedingJoinPoint;

public class CacheAspect {
	private HashMap<String,Object> cache=new HashMap<String,Object>();
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
