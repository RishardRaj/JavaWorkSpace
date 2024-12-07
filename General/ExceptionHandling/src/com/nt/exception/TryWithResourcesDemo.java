//TryWithResourcesDemo.java
package com.nt.exception;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResourcesDemo {
	public static void main(String[] args) {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"))) {
			String fileName = "output.txt";
			bufferedReader = new BufferedReader(new FileReader(fileName));
			System.out.println("By all Resource reference varibles of autocloseable resources are final");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
