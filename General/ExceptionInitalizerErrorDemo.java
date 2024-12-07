package com.nt.exception;

public class ExceptionInitalizerErrorDemo {
	//static int x = 10 / 0;
	static{
		String s=null;
		System.out.println(s.length());
		}
	public static void main(String[] args) {
		//System.out.println(x);
	}

}