//StarsDisplay.java
package com.nt.basic;

public class StarsDispay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 5;
		for (int i = 1; i <= r; i++) {
			for (int st = 1; st <= i; st++) {
				System.out.println(i+" "+st);
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
