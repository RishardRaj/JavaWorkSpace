//CustomImmutableCustomerTest.java
package com.nt.javalang;

public class CustomImmutableCustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomImmutableCustomer customImmutableCustomer1, customImmutableCustomer2, customImmutableCustomer3,
				customImmutableCustomer4 = null;
		customImmutableCustomer1 = new CustomImmutableCustomer(10);
		customImmutableCustomer2 = customImmutableCustomer1.modify(30);
		customImmutableCustomer3 = customImmutableCustomer1.modify(10);
		customImmutableCustomer4 = customImmutableCustomer1.modify(40);
		System.out.println(customImmutableCustomer1 == customImmutableCustomer2);
		System.out.println(customImmutableCustomer1 == customImmutableCustomer3);
		System.out.println(customImmutableCustomer1 == customImmutableCustomer4);
	}// main

}// class
