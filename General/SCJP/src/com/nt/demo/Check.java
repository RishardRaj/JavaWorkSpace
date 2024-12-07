package com.nt.demo;

public class Check {
	public static void main(String[] args) {
		String str = "null";
		if (str == null) {
			System.out.println("null");
		} else if (str.length() == 0) {
			System.out.println("zero");
		} else {
			System.out.println("some");
		}
	}
}
