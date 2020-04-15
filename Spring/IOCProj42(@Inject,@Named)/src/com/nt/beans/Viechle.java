package com.nt.beans;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Named("viechle")
//@Scope(value="singleton")
public class Viechle {
	//@Inject
	  private Engine engg;

/*	@Inject 
public Viechle(Engine engg) {
		System.out.println("constructor");
		this.engg = engg;
	}*/

	

 /*@Inject
public void setEngg(Engine engg) {
		System.out.println("setEngg(-)");
		this.engg = engg;
	}*/
	  
	  @Inject
	  @Named("eng1")
	  public void assign(Engine engg){
		  System.out.println("assign(-)");
		  this.engg=engg;
	  }

	@Override
	public String toString() {
		return "Viechle [engg=" + engg + "]";
	}
	
	
}
