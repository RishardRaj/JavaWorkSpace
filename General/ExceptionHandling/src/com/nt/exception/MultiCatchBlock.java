//MultiCatchBlock.java
package com.nt.exception;

public class MultiCatchBlock {
public static void main(String[] args) {
	try{
		System.out.println(10/0);
	}catch (ArithmeticException exception) {
		// TODO: handle exception
		exception.printStackTrace();
	}
	catch(Exception exception){
		
	}
	
}
}
