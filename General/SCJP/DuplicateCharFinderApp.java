//DuplicateCharFinderApp.java
package com.nt.scjp;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCharFinderApp {
	public static void main(String[] args) {
		Scanner scanner = null;
		String word,word1= null;
		char ch[] = null;
		int count = 0;
		HashMap<Integer, Character> hashMap=null;
		scanner = new Scanner(System.in);
		System.out.println("Enter An English Word to find No.of Chars Repeated in it");
		word = scanner.next();
		word1=new String();
		ch = word.toCharArray();
		System.out.println(word1.length());
		System.out.println(ch.length);
		for (int i =0; i <ch.length; i++) {
			if (ch[i] == ch[i + 1]) {
				count++;
				hashMap=new HashMap<>();
				hashMap.put(count,ch[i]);
			} // if
			if (count > 1) {
				System.out.println(count + " " + hashMap.get(count));
			} // if
		} // for
		
		
		/*else {
			System.out.println("No Such Character is Repeated");
		} // else
*/		scanner.close();
	}// main
}// class