package com.nt.files;

public class ReverseRecursion {
	private static String reverse(String word) {
		/*if (word.isEmpty())
			return word;*/
		System.out.println(word);
		return reverse(word.substring(1))+ word.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String finalString = reverse("Rajasekhar");
		System.out.println(finalString);
	}

}
