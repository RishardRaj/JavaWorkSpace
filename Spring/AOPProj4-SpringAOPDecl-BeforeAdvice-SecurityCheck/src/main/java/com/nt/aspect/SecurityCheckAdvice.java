package com.nt.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class SecurityCheckAdvice implements MethodBeforeAdvice {
	private AuthenticationManager manager;

	public void setManager(AuthenticationManager manager) {
		this.manager = manager;
	}

	public void before(Method method, Object[] args, Object target) throws Throwable {
     //peform security check
		if(!manager.authenticate())
			throw new IllegalAccessException("Invalid username/password");
		
		
	}
	

}
