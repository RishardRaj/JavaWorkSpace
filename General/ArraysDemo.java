package org.practice.general;

import java.util.Scanner;

public class ArraysDemo {
	public static void main (String[] args){
		System.out.println("Enter 5 numbers");
		int numbers [] = new int[5];
		int temp=0;
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<5 ; i++){
		numbers[i]=scanner.nextInt();
		//System.out.print(numbers[i]+"-----"+numbers.length);
		}//for
		int limit = numbers.length-1;
		for(int i=0;i<limit;i++){
			for(int j=0; j<limit-i; j++){
				if(numbers[j]>numbers[j+1]){
					temp = numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1] = temp;
					flag=true;
				}//if
			}//2nd for
				if(flag == false)
					break;
				else 
					flag = false;
		}//1st for
		for(int i=0;i<numbers.length;i++){
			System.out.print("*****"+numbers[i]);
		}//for
	}//main
}//class