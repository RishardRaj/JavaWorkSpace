package com.nt.serialization;

import java.util.Arrays;
import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[5];
		int[] ids = new int[5];
		
		for (int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Names:");
			names[i] = sc.nextLine();
			System.out.println("Enter Ids:");
			ids[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(names) + "-----------------" + Arrays.toString(ids));
	}

}