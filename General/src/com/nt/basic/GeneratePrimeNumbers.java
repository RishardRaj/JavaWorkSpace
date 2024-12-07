package com.nt.basic;

import java.util.Scanner;

public class GeneratePrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = null;
		scanner = new Scanner(System.in);
		int number = 0;
		String str=" ";
		String str1="abc";
		String str2="ABC";
		String str4=null;
		System.out.println(str==str4);//false
		System.out.println(str1.equals(str2));//false
		System.out.println(str1.equalsIgnoreCase(str2));//true
		System.out.println(str1==str2);//false
		System.out.println("Enter A Prime Number Limit");
		number = scanner.nextInt();
		
		for (int i = 2; i <= 50; i++) {
			for (int j = 1; j >= i / 2; j++) {
				if (i % j == 1) {
					System.out.println(i);
				}
			}
			if (number % i == 0) {

			}

		}
	}

}
