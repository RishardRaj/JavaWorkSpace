package com.nt.basic;

public class StringCount {
	public static int countOccurrences(String haystack, char needle) {
		int count = 0;
		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int occurences = StringCount.countOccurrences("ffsadefegggdgsdgsa", 'f');
		System.out.println(occurences);
	}
}

