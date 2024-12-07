package com.nt.basic;

import java.util.Scanner;

public class StringReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word, result = null;
		Scanner scanner = null;
		char[] character = null;
		System.out.println("Enter the String:");
		scanner = new Scanner(System.in);
		word = scanner.next();
		/*
		 * System.out.println("sub string"+word.substring(2)); character =
		 * word.toCharArray(); System.out.println(); for (int i =
		 * character.length - 1; i >= 0; i--) { System.out.print(character[i]);
		 * }
		 */
		System.out.println(word.charAt(word.length() - 1));
		System.out.println(word.substring(0));
		result = reverseString(word);
		System.out.println(result);
		scanner.close();
	}

	public static String reverseString(String word) {
		if (word.length() == 1) {
			return word;
		} else {
			String empty = "";
			empty += word.charAt(word.length() - 1) + reverseString(word.substring(0, word.length() - 1));
			return empty;
		}
	}
}
