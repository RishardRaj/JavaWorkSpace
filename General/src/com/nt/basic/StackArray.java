//StackArray.java
package com.nt.basic;

import java.awt.DisplayMode;
import java.util.Arrays;

public class StackArray {
	private int[] stack;
	private int size;
	private int top;

	public StackArray(int size) {
		this.size = size;
		stack = new int[size];
	}

	public void push(int element) {
		/*
		 * if(size==stack.length){ extendStack(); }
		 */
		stack[top] = element;
		top++;
	}

	public void pop() {
		if (!isEmpty()) {
			top--;
		}
	}

	public boolean isEmpty() {
		if (stack.length == 0) {
			return true;
		}
		return false;
	}

	public void extendStack() {
		int copy[] = Arrays.copyOf(stack, stack.length);
	}

	public void display() {
		System.out.println(Arrays.toString(stack));
	}

	public static void main(String[] args) {
		StackArray stackArray = new StackArray(10);
		stackArray.push(1);
		stackArray.push(2);
		stackArray.push(3);
		stackArray.push(4);
		stackArray.push(5);
		stackArray.pop();
		stackArray.display();
	}
}
