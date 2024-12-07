package com.nt.java8;

public class Java8Test
{
	//functional interface with single abstract method
interface MyIntr {
	void message();
}
public static void main(String[] args) 
	{
		MyIntr myIntr=()->{System.out.println("Lambda expression");};
		myIntr.message();
	}
}