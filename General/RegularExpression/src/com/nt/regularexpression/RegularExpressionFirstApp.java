//RegularExpressionFirstApp.java
package com.nt.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionFirstApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Pattern pattern = Pattern.compile("raj");
		Matcher matcher = pattern.matcher("fsafarajafafrajtaaraj");
		while (matcher.find()) {
			count++;
			System.out.println(matcher.start() + "--------" + matcher.end() + "--------------" + matcher.group());
		}
		System.out.println("The no.of Occurences" + count);
	}

}
