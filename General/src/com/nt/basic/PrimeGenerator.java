//PrimeGenerator.java

package com.nt.basic;

public class PrimeGenerator {
	public int i;
	static int count = 0;

	public static void generate() {
		for (int i = 2; i <= 50; i++) {
			count = 0;
			//System.out.println("Number"+i);
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.print(i+",");
			}
		}
	}

	public static void main(String[] args) {
		generate();
	}
}