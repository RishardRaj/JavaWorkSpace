//MethodInnerDemo.java
package com.nt.basic;

public class MethodInnerDemo 
{
int x=100;
static int y=200;
public void m1(){
	int z=300;
	class Inner
	{
	public void m2(){
	System.out.println("Inside Inner Class Method Accessing instance and static members of outer class "+x+" "+y);
	System.out.println("Local Variable Value from outer class method "+z);
	} 
	}
	Inner inner=new Inner();
	inner.m2();
	System.out.println("From Outer Class Instance Method");
	}
	public static void main(String[] args) 
	{
	MethodInnerDemo methodInnerDemo=new MethodInnerDemo();
	methodInnerDemo.m1();
	}
}
