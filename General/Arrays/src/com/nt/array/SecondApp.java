//SecondApp.java
package com.nt.array;

public class SecondApp {
	public static void main(String[] args) {
		String argh[] = { "ABC", "XYZ" };
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		args = argh;
		for (int i = 0; i < argh.length; i++) {
			System.out.println(args[i]);
		}
	}
}
