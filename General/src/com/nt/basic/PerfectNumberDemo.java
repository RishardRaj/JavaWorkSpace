package com.nt.basic;

import java.util.Scanner;

public class PerfectNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = null;
		int number = 0;
		boolean flag = false;
		int result = 0;
		int sum = 0;
		System.out.println("Enter the number:");
		scanner = new Scanner(System.in);
		number = scanner.nextInt();
		for(int i=1;i<=number/2;i++){
			if(number%i==0){
				result=result+i;
			}
		}
		if (result==number) {
			System.out.println("Given Number is Perfect Number");
		} else {
			System.out.println("Given Number is not perfect Number");
		}
		scanner.close();
	}// main
}
