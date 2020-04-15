package com.nt.aspect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheAdvice implements MethodInterceptor {
   private Map<String,Float> cache=new HashMap<String,Float>();
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String key=null;
		Object retVal=null;
		//prepare target method with args as the key
		key=invocation.getMethod().getName()+Arrays.toString(invocation.getArguments());
		//check for the result in cache
		if(!cache.containsKey(key)){
			System.out.println("from target method");
			retVal=invocation.proceed();  //calls target method
			cache.put(key,((Float)retVal));
		}
		else{
			System.out.println("from cache");
			retVal=cache.get(key);
		}
		return retVal;
	}//method
}//class
