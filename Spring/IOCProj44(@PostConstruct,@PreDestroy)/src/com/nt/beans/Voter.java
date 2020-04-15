
package com.nt.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
@Named("voter")
public class Voter {
	@Value("raja")
	private String name;
	@Value("30")
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@PostConstruct
	public void myInit()throws IllegalArgumentException{
		System.out.println("Voter:myInit()");
		if(name.length()==0 || age<=0)
			throw new IllegalArgumentException("Set Proper Inputs");
	}
	
	@PreDestroy
	public void myDestroy()throws IllegalArgumentException{
		System.out.println("Voter:myDestroy()");
		 name=null;
		 age=0;
	}

	

	
	public String checkVotingElgibility(){
		if(age<18){
			return name+"  u  r not elgible to vote";
		}
		else{
			return name+"  u  r  elgible to vote";
		}
	}//method
}//class
