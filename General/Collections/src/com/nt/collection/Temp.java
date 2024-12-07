//Temp.java
package com.nt.collection;

public class Temp {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Temp";
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalize(-) method called");
	}
}
