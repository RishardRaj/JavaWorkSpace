package com.nt.beans;

public class B {
	private A a;
	public B(){
		System.out.println("B:0-param constructor");
	}
	public B(A a){
		this.a=a;
		System.out.println("B:1-param constructor");
	}
	
	public void setA(A a){
		this.a=a;
	}
}
