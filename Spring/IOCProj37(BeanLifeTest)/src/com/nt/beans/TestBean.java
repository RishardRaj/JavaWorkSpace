package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TestBean implements InitializingBean,DisposableBean,BeanFactoryAware,BeanNameAware,ApplicationContextAware {
 
private String msg;
	public TestBean(String msg) {
	System.out.println("TestBean:1 -param constructor");
	this.msg = msg;
}
	  public void setMsg(String msg) {
		  System.out.println("TestBean:setMsg(-)");
			this.msg = msg;
		}


	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("TestBean:setApplicationContext(-)");
		
	}

	@Override
	public void setBeanFactory(BeanFactory factirt) throws BeansException {
		System.out.println("TestBean:setBeanFactory(-)");
		
	}

	@Override
	public void destroy() throws Exception {
	 System.out.println("TestBean:destoy()");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("TestBean:afterPropertiesSet()");
		
	}

	public void myInit(){
		System.out.println("TestBean:customInit()");
	}
	
	public void myDestroy(){
		System.out.println("TestBean:customDestroy()");
	}
	@Override
	public void setBeanName(String arg0) {
		System.out.println("TestBean:setBeanName(-)");
		
	}
	
}
