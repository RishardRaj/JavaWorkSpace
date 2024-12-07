//LamdaExpressionDemo.java
package com.nt.basic;

import java.util.*;

public class  LambdaExpressionDemo
{
	interface Functional{
		void calculate(double radius);
	}//interface
	void calculateCircleArea(double radius,Functional functional){
	functional.calculate(radius);
	}
	public static void main(String[] args) 
	{
		LambdaExpressionDemo lambdaExpressionDemo=new LambdaExpressionDemo();
		Functional functional=(r)->{System.out.println("Area "+Math.PI*r*r);1};
		lambdaExpressionDemo.calculateCircleArea(2232.22,functional);
		System.out.println("Hello World!");
	}
}
