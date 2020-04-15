package com.nt.beans;

public class CheckVoting {
	private String name;
	private int age;

	public CheckVoting() {
		System.out.println("constructor");
	}
	
	public void myInit()throws Exception{
		System.out.println("myInit()");
		if(name==null || age<=0)
			throw new Exception("provide valid inputs....");
	}
	
	public void myDestroy(){
		System.out.println("myDestroy()");
		name=null;
		age=0;
	}
	
	public void setName(String name) {
		System.out.println("setName(-)");
		this.name = name;
	}

	public void setAge(int age) {
		System.out.println("setAge(-)");
		this.age = age;
	}

	// B/method
	public String checkVotingEligibility() {

		if (age < 18)
			return name + " u r not elgible to vote and wait for" + (18 - age) + " years";
		else
			return name + " u r  elgible to vote";
	}

}
