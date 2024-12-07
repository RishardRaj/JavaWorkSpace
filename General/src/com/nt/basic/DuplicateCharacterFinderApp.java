//DuplicateCharacterFinderApp.java
package com.nt.basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterFinderApp {
	private Map<Character, Integer> hashMap = new HashMap<>();
	private Set<Character> hashSet = new HashSet<>();

	public void calculateDuplicateChars(String word) {
		char[] ch = word.toLowerCase().toCharArray();
		/*
		 * for (Character character : ch) { hashSet.add(character);
		 * System.out.println(hashSet); }// for-each
		 */

		for (Character character : ch) {
			if (hashMap.containsKey(character)) {
				hashMap.put(character, hashMap.get(character) + 1);
			} // if
			else {
				hashMap.put(character, 1);
			} // else
		} // for-each
		hashSet = hashMap.keySet();
		for (Character character : hashSet) {
			if (hashMap.get(character) > 1) {
				System.out.println(
						"Characters Repeated in the given word " + character + "----->" + hashMap.get(character));
			} // if
		} // for-each

	}// calculateDupliacateChars(-)
}