//FibonacciGeneratorApp.java
package com.nt.basic;

public class FibonacciGeneratorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generate();
	}

	private static void generate() {
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1);
		System.out.print(n2);
		for (int i = 0; i < 100; i++) {
			int sum = n1 + n2;
			if(sum <= 500) {
				n1 = n2;
				n2 = sum;
				System.out.print(sum+" ");
			}
		}
	}

}
