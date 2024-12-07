//Customer.java
package com.nt.javalang;

public class Customer {
	public String name;
	public int rollNo;

	public Customer(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public boolean equals(Object object) {
		String name1, name2 = null;
		int rollNo1, rollNo2 = 0;
		Customer customer = null;
		try {
			System.out.println("My Own .equals() method");
			name1 = this.name;
			rollNo1 = this.rollNo;
			if (this == object) {
				return true;
			}
			if (object instanceof Customer) {
				customer = (Customer) object;
				name2 = customer.name;
				rollNo2 = customer.rollNo;
				if (name1.equals(name2) && rollNo1 == rollNo2) {
					return true;
				} // if
				else {
					return false;
				} // else
			} // if
		} // try
		catch (ClassCastException classCastException) {
			classCastException.printStackTrace();
			return false;
		} // catch
		catch (NullPointerException nullPointerException) {
			// TODO: handle exception
			 nullPointerException.printStackTrace();
			return false;
		} // catch
		return false;
	}

}
