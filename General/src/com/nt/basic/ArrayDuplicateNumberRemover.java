//ArrayDuplicateNumberRemover.java
package com.nt.basic;

import java.util.Arrays;

public class ArrayDuplicateNumberRemover {
	public static int removeDuplicates(int arr[], int length) {
		if (length == 0 || length == 1) {
			return length;
		}
		int temp[] = new int[length];
		int j = 0;
		for (int i = 0; i < length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
				System.out.println(i+"-----*******----"+j);
			} // if
			System.out.println(i+"-----=========----"+j);
		} // for
		
		temp[j++] = arr[length - 1];
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		} // for
		return j;
	}

	public static int[] removeDuplicates(int[] arr) {

		int end = arr.length;

		for (int i = 0; i < end; i++) {
			for (int j = i + 1; j < end; j++) {
				if (arr[i] == arr[j]) {
					int shiftLeft = j;
					for (int k = j + 1; k < end; k++, shiftLeft++) {
						arr[shiftLeft] = arr[k];
					}
					end--;
					j--;
				}
			}
		}

		int[] whitelist = new int[end];
		for (int i = 0; i < end; i++) {
			whitelist[i] = arr[i];
		}
		return whitelist;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 3, 1, 2, 2, 4, 2, 1, 4, 5, 7, 1, 5, 5, 5, 5, 3, 3, 3 };
		// int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
		// int arr[]=new int[]{101,101,102,102,102,103,103,103};
		int length = arr.length;
		//Arrays.sort(arr);
		int newarray = removeDuplicates(arr, length);
		for (int i = 0; i < newarray; i++) {
			System.out.print(arr[i]);
		}
		int array[] = removeDuplicates(arr);
		System.out.println(Arrays.toString(array));
	}
}
