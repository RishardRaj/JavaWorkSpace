//CustExceptions.java
package com.nt.customexceptions;

import java.util.Scanner;

public class CustExceptions {
public static void main(String[] args) {
	System.out.println("Enter Your Age:");
	Scanner scanner=new Scanner(System.in);
	int age=scanner.nextInt();
	//int age=Integer.parseInt(args[0]);
	if(age>60){
	throw new TooOldException("Please wait some more time you will get best match soon.........");
	}
	else if (age<18) {
		throw new TooYoungException("Your age is already crossed marriage age....no chance of getting marriage");
	}
	else {
		System.err.println("Your will get match details soons....");
	}
}
}
