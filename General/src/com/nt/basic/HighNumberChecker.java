package com.nt.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HighNumberChecker {
	public static int compare(int[] numbers) {
		int temp = 0;
		for (int i = 0; i <= numbers.length; i++) {
			if (numbers[i] >= numbers[i + 1]) {
				numbers[temp] = numbers[i];
				numbers[i + 1] = numbers[temp];
				temp++;
			}
		}
		return numbers[temp];
	}
	public static void main(String[] args) {
		BufferedReader bufferedReader=null;
		bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
	}
}
