package com.nt.basic;

public class ReversingStringApp {
	public static void main(String[] args) {
		String name = "Rajasekhar";
		char[] ch = name.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}
}
