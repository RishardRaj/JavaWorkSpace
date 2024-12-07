//Child.java
package com.nt.basic;

public class Child extends Parent {
	static int j;

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(j);
	}
	
	public Integer test() {
		System.out.println("String version");
		try {
			throw new RuntimeException();
		}catch(Exception e) {
			return 2;
		}finally {
			return 3;
		}
	}
}
