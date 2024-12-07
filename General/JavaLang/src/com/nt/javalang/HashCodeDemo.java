//HashCodeDemo.java
package com.nt.javalang;

public class HashCodeDemo {
	private int i;

	public HashCodeDemo(int i) {
		System.out.println("HashCodeDemo 1-Param Constructor");
		this.i = i;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return i;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return i + "";
	}
}
