//CustomImmutableCustomer.java
package com.nt.javalang;

public final class CustomImmutableCustomer {
	private int i;

	public CustomImmutableCustomer(int i) {
		System.out.println("CustomImmutableCustomer 1-param Constructor");
		this.i = i;
	}

	public CustomImmutableCustomer modify(int i) {
		if (this.i == i) {
			return this;
		} // if
		else {
			return new CustomImmutableCustomer(i);
		} // else
	}// method
}// class
