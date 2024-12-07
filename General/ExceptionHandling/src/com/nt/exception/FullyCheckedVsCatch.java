//FullyCheckedVsCatch.java
package com.nt.exception;

import java.io.IOException;

public class FullyCheckedVsCatch {
public static void main(String[] args) {
	try{
		System.out.println("Hello");
		System.out.println("We cannot write catch block for FullyCheckedException");
		throw new IOException("Personlized IOException");
	}
	catch (IOException ioException) {
		// TODO: handle exception
	}
}
}
