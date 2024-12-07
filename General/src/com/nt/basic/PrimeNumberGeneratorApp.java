//PrimeNumberGeneratorApp.java
package com.nt.basic;

public class PrimeNumberGeneratorApp {
	/* Separate business logic so that you can reuse when ever required */
	private static boolean generatePrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			} // if
		} // for
		return true;
	}// method

	public static void main(String[] args) {
		int number = 2;
		int count = 0;
		boolean result = false;
		/* For checking prime in a range of 100 numbers */
		while (count < 100) {
			result = generatePrime(number);
			if (result) {
				System.out.print(number + ",");
			} // if
			count++;
			number++;
		} // while
	}// main
}// class