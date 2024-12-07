//ClosingParenthesisFinderApp.java
package com.nt.basic;

public class ClosingParenthesisFinderApp {
	public void closingParenthesis(String word) {
		int count = 0;
		char[] chars = word.toCharArray();
		for (Character ch : chars) {
			System.out.println(ch);
			if (ch.equals('(')) {
				count++;
			} // if
			else if (ch.equals(')')) {
				count--;
			}
			//System.out.println(count);
		} // for-each
		if (count > 0) {
			System.out.println(count + "Closing Parenthesis is/are required");
		} else if (count < 0) {
			System.out.println(-count + "More Closing Parenthesis are given");
		} else {
			System.out.println("No Closing Parenthesis are required");
		}
	}
}
