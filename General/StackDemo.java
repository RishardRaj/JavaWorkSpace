//StackDemo.java
package com.nt.basic;

import java.util.List;
import java.util.ArrayList;

public class StackDemo
{
	private static List<Integer>  list=new ArrayList<>();
	public StackDemo(){
	System.out.println("Stack is Ready");
	}
	public static void  push(int element){
	list.add(0,element);
		System.out.println("Pushed Element into Stack");
	}
	public static void pop(){
	if(!list.isEmpty()){
			int topElement=list.get(0);
			list.remove(0);
			System.out.println("Removed Element from Stack");
	}
	}
	public static void main(String[] args) 
	{
		push(1);
		pop();
	}
}
