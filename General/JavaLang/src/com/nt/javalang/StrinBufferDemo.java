//StringBufferDemo.java
package com.nt.javalang;

public class StrinBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final StringBuffer stringBuffer = new StringBuffer("Raja");
		stringBuffer.append("sekhar");
		System.out.println(stringBuffer);
		// stringBuffer = new StringBuffer("afasga");
		System.out.println("final modifier won't give any immutability nature");
	}

}
