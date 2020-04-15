package com.nt.beans;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named("viechle")
@Scope(value="singleton")
public class Viechle {
	//@Resource
	  private Engine engg;


	

/* @Resource
public void setEngg(Engine engg) {
		System.out.println("setEngg(-)");
		this.engg = engg;
	}*/
	  
	  
	  @Resource(name="eng")
	  public void assign(Engine engg){
		  System.out.println("assign(-)");
		  this.engg=engg;
	  }

	@Override
	public String toString() {
		return "Viechle [engg=" + engg + "]";
	}
	
	
}
