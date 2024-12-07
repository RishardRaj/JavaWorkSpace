//BubbleSortingApp.java
package com.nt.basic;

public class BubbleSortingApp {
	public static void main(String[] args) {
		int numbersList[] = { 232, 131, 4, 2, 6, 224, 7474 };
		int temp = 0;
		for (int i = 0; i <= numbersList.length - 1; i++) {
			for (int j = 1; j < numbersList.length - i; j++) {
				System.out.println(i+""+j);
				if (numbersList[j-1] > numbersList[j]) {
					temp = numbersList[j];
					numbersList[j] = numbersList[j-1];
					numbersList[j-1] = temp;
				}
			}
		}
		for (int k = 0; k <= numbersList.length - 1; k++) {
			System.out.print(numbersList[k]+" ");
		}
	}
}
