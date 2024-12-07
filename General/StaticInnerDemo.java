//StaticInnerDemo.java
package com.nt.basic;

public class StaticInnerDemo 
{
	class Inner
	{
	public static void main(String[] args) 
	{
		System.out.println("Inner Class Main Method");
	}

	};
	public static void main(String[] args) 
	{
		System.out.println("Outer Class Main Method");
	}
}
