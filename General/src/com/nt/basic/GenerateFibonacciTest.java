/**
 * 
 */
package com.nt.basic;

import java.util.Scanner;

/**
 * @author RAJ
 *
 */
public class GenerateFibonacciTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A NUMBER FOR FIBONACCI SERIES:");
		int number = scanner.nextInt();
		GenerateFibonacciNumApp generateFibonacciNumApp = new GenerateFibonacciNumApp();
		generateFibonacciNumApp.generate(number);
	}

}
