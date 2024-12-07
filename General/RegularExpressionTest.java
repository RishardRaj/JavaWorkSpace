//RegularExpressionTest.java
package com.nt.basic;

import java.util.regex.*;

public class RegularExpressionTest {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\s");
		String[] s = p.split("bhaskar software solutions");
		for (String s1 : s) {
			System.out.println(s1);// bhaskar
			// software
			// solutions
		}
	}
}
