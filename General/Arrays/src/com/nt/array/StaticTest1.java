//StaticTest1.java
package com.nt.array;

public class StaticTest1 {

	public static void main(String[] args) {
		int i = 0;
		for (int j = 0; j < 3; j++) {
			i = i + j;
			System.out.println(i+"---------------"+j);
		}
		//System.out.println(i+"---------------"+j);
	}
	public int add(){
		return 1;
	}
	public int add(int i,int j){
		return i+j;
	}
}
