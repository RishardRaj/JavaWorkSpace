//EqualsMethodOverridingTest.java
package com.nt.javalang;

public class EqualsMethodOverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1, customer2, customer3, customer4 = null;
		customer1 = new Customer("RAJ", 23232);
		customer2 = new Customer("Rafssg", 24242);
		customer3 = new Customer("RAJ", 23232);
		customer4 = customer1;
		System.out.println(customer1.equals(customer4));
		System.out.println(customer1.equals(customer3));
		System.out.println(customer1.equals(customer2));
		System.out.println(customer1.equals("RAJ"));
		System.out.println(customer1.equals(null));
		System.out.println(customer1.equals(new Student("etetete",43325)));
	}

}