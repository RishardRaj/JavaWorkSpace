package com.nt.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CommonBPP implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String id) throws BeansException {
        System.out.println("CommonBPP:postProcessBeforeInitialization(-,-)");	    
		return bean;
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String id) throws BeansException {
		System.out.println("CommonBPP:postProcessAfterInitialization(-,-)");
		return bean;
	}

}
