//HashCodeTest.java
package com.nt.javalang;

public class HashCodeTest {
	private int i;

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

	public HashCodeTest(int i) {
		this.i = i;
	}

	public static void main(String[] args) {
		HashCodeTest t1 = new HashCodeTest(10);
		HashCodeTest t2 = new HashCodeTest(10);
		System.out.println(t1.hashCode());// 10
		System.out.println(t2.hashCode());// 10
		System.out.println(t1 == t2);// false
	}
}
