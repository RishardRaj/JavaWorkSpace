package com.nt.basic;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumberFinder {
	public int findDuplicateNumber(List<Integer> numbers) {
		int highestNumber = numbers.size() - 1;
		System.out.println(highestNumber);
		int total = getSum(numbers);
		System.out.println(total);
		//int duplicate = total - (highestNumber * (highestNumber + 1) / 2);
		int duplicate=total/2-2*(total-1);
		return duplicate;
	}

	public int getSum(List<Integer> numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;
	}

	public static void main(String a[]) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i < 30; i++) {
			numbers.add(i);
		}
		// add duplicate number into the list
		numbers.add(22);
		DuplicateNumberFinder dn = new DuplicateNumberFinder();
		System.out.println("Duplicate Number: " + dn.findDuplicateNumber(numbers));
	}

}
