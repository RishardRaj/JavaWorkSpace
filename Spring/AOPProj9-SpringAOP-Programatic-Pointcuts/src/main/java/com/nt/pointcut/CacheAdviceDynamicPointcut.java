package com.nt.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class CacheAdviceDynamicPointcut extends DynamicMethodMatcherPointcut {

	public boolean matches(Method method, Class<?> target, Object[] args) {
		if(target==com.nt.target.Math.class &&(method.getName().equals("add") ||method.getName().equals("mul")) && ((Integer)args[0])>=1000 && ((Integer)args[1])>=1000)
		return true;
		else
		return false;
	}

}
