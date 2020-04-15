package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Viechle implements ApplicationContextAware{
 
private String beanId;
  private ApplicationContext ctx=null;
  
  public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
	}
	
	public void move(){
		Engine engg;
		//get Depdent Engine object
		engg=ctx.getBean(beanId,Engine.class);
		//use engine obj
		engg.start();
		System.out.println("Viechle is ready t	o move");
	}
	
	public void entertaiment(){
		System.out.println("Vichle equipped with Audio/Video Player for entertainment");
	}
	

}
