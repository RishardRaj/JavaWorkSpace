package com.nt.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Viechle {
	
	private String beanId;

	 public void setBeanId(String beanId) {
			this.beanId = beanId;
		}
	  public void move(){
	   BeanFactory factory=null;
	   Engine engg=null;
	   //create IOC container
	   factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
	    //get Bean (Depdency lookup)
	   engg=factory.getBean(beanId,Engine.class);
	   engg.start();
	   System.out.println("Viechle moved");
	   }
	   public void entertainment(){
	       System.out.println("Audio Player + Video Player are given for entertainment ");
	   }
	   public void soundHorn(){
	    System.out.println(" Skoda  Horn is to honk ");
	   }
}
