//StringConversionApp.java
package com.nt.basic;

public class StringConversionApp {
	public static int convertStingToInt(String number) {
		char[] ch = number.toCharArray();
		int zeroAscii = (int) '0';
		int sum = 0;
		System.out.println("Zero Ascii" + zeroAscii);
		for (char character : ch) {
			int tempAscii = (int) character;
			System.out.println("Character Ascii"+ch+" "+tempAscii);
			sum = sum * 10 + tempAscii - zeroAscii;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("5242 String Value" + convertStingToInt("5242"));
	}
}

