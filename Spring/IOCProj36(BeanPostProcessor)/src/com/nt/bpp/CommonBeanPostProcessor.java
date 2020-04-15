package com.nt.bpp;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.nt.bo.BaseBO;

public class CommonBeanPostProcessor implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanId) throws BeansException {
	    System.out.println("BPP:postProcessBeforeInitialization(-,-)");
	    
	    if(bean instanceof BaseBO){
	    	((BaseBO) bean).setDoj(new Date());
	    	return bean;
	    }
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanId) throws BeansException {
		System.out.println("BPP:postProcessAfterInitialization(-,-)");
		// TODO Auto-generated method stub
		return bean;
	}

}
