package com.nt.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class PMAdviceStaticPointcut extends StaticMethodMatcherPointcut {

	public boolean matches(Method method, Class<?> target) {
		if(target==com.nt.target.Math.class && method.getName().equals("add")){
		return true;
	}
		else{
			return false;
		}
	}//method
}//class
