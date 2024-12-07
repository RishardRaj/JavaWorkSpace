//GenerateFibanacciNumApp.java
package com.nt.basic;

public class GenerateFibonacciNumApp {
	public void generate(Integer number) {
		int firstNum = 0;
		int secondNum = 1;
		int count = 3;
		System.out.println(firstNum);
		System.out.println(secondNum);
		int result = firstNum + secondNum;
		while (count < number) {
			firstNum = secondNum;
			secondNum = result;
			result = firstNum + secondNum;
			System.out.println(result);
			count++;
		}
	}
}
