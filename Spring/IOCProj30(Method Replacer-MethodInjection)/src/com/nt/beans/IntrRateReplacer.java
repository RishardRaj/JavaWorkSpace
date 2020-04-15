package com.nt.beans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class IntrRateReplacer implements MethodReplacer {
	private float rate;
	public void setRate(float rate) {
		this.rate = rate;
	}
	@Override
	public Object reimplement(Object bean, Method method, Object[] args) throws Throwable {
		
		System.out.println("reimplement(-,-,-)");
		float pAmt=0.0f,time=0.0f;
		System.out.println("----------------------------------");
		System.out.println("target class name:"+bean.getClass());
		System.out.println("target method name::"+method.getName());
		System.out.println("target method args"+Arrays.toString(args));
		//write new b.logic
		pAmt=((Float)args[0]);
		time=((Float)args[1]);
		return (pAmt*time*rate/100.0f);
	}

}
