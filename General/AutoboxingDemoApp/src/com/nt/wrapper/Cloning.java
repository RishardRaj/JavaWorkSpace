//Cloning.java
package com.nt.wrapper;

public class Cloning implements Cloneable {
	int i = 10;
	int j = 20;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Cloning cloning = new Cloning();
		Cloning cloning2 = (Cloning) cloning.clone();
		cloning2.i=8888;
		cloning2.j=9999;
		System.out.println(cloning.i+"---------------"+cloning.j);
		System.out.println("====================");
		System.out.println(cloning2.i+"-----------------"+cloning2.j);
	}//main
}//class
