//RegularExpressionTest.java
package com.nt.basic;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {
	public static void main(String[] args) {
		/*
		 * Pattern p = Pattern.compile("\\s"); String[] s =
		 * p.split("bhaskar software solutions"); for (String s1 : s) {
		 * System.out.println(s1);// bhaskar // software // solutions }
		 */

		/*
		 * Pattern p =
		 * Pattern.compile("[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")
		 * ; // Pattern p=Pattern.compile("[7-9][0-9]{9}"); Matcher m =
		 * p.matcher(args[0]); if (m.find() && m.group().equals(args[0])) {
		 * System.out.println("valid number"); } else {
		 * System.out.println("invalid number"); }
		 */
		/*
		 * Pattern pattern=Pattern.compile("[a-zA-Z][a-zA-Z0-9-#]+"); Pattern
		 * p=Pattern.compile("[a-zA-Z][a-zA-Z0-9-#][a-zA-Z0-9-#]*"); Matcher
		 * m=p.matcher(args[0]); if(m.find()&&m.group().equals(args[0])) {
		 * System.out.println("valid identifier"); } else {
		 * System.out.println("invalid identifier"); }
		 */
		int count = 0;
		Pattern p = Pattern.compile("[a-zA-Z0-9-$.]+[.]java");
		File f = new File("D:\\Practices\\jse\\");
		String[] s = f.list();
		for (String s1 : s) {
			Matcher m = p.matcher(s1);
			if (m.find() && m.group().equals(s1)) {
				count++;
				System.out.println(s1);
			}
		}
		System.out.println(count);
	}
}