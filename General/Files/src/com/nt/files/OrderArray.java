package com.nt.files;

import java.util.Arrays;

public class OrderArray {
	public static void main(String[] args) {
		int a[] = { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0 };
		int temp[];
		int[] temp1 = null;
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				int j = 0;
				temp = new int[a.length];
				temp[i] = j;
			} else {
				int k = 1;
				temp1= new int[a.length];
				temp1[i] = k;
			} // else
			temp = Arrays.copyOf(temp1, a.length);
			System.out.println(temp);
		} // for
	}// main
}// class