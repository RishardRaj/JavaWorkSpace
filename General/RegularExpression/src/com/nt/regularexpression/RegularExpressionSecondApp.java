//RegularExpressionSecondApp.java
package com.nt.regularexpression;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class RegularExpressionSecondApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Pattern pattern = Pattern.compile("\\s");
		String[] words = pattern.split("durga software solutions");
		for (String word : words) {
			System.out.println(word);
		}
		StringTokenizer st = new StringTokenizer("durga software solutions");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
