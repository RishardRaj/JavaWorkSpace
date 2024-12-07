package com.nt.customexceptions;

import java.util.Scanner;

class TooYoungException extends RuntimeException {
	String message;

	TooYoungException(String message) {
		super(message);
	}

}
class TooOldException extends RuntimeException {
	String message;

	TooOldException(String message) {
		super(message);
	}

}
public class CustExceptions {
public static void main(String[] args) {
	System.out.println("Enter Your Age:");
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
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
