 //StackArray.java
package com.nt.basic;

import java.util.Arrays;

public class StackArray 
{
private int[] stack;
private int size;

public StackArray(int size){
this.size=size;
stack=new int[size];
}

public  void push(int element){
	if(size==stack.length){
	//extendStack();
	}
	stack[size]=element;
	size++;
}
public void pop(){
if(!isEmpty()){
size--;
}
}
public  boolean isEmpty(){
	if(stack.length==0){
		return true;
	}
	return false;
}
public  void extendStack(){
int copy[]=Arrays.copyOf(stack,stack.length);
}
public static void main(String[] args) 
	{
	StackArray stackArray=new StackArray(10);
	stackArray.push(1);
	stackArray.push(2);
	stackArray.push(3);
	stackArray.push(4);
	stackArray.push(5);
	stackArray.pop();
	}
}
