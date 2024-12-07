//CharacterSortingApp.java
package com.nt.basic;

import java.util.Arrays;

public class CharacterSortingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "tetegaeed";
		char[] chars = word.toCharArray();
		char temp = '0';
		for (int i = 0; i <= chars.length - 1; i++) {
			for (int j = 1; j <= chars.length - 1; j++) {
				System.out.println(i+"-"+j);
				if (chars[j] > chars[i]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				} // if
			} // for
		} // for
		for (int k = 0; k <= chars.length - 1; k++) {
			System.out.print(chars[k]);
		}
		/*
		 * Arrays.sort(chars); String sortedString=new String(chars);
		 * System.out.println(sortedString);
		 */
	}// main

}
