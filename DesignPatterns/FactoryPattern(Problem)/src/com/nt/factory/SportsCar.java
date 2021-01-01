//SportsCar.java
package com.nt.factory;

public class SportsCar extends Car {
	private int capacity;

	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		System.out.println("Sports Car Assemble");
	}
	@Override
	public void roadTest() {
		// TODO Auto-generated method stub
	System.out.println("Sports Car Road Tested");
	}
	@Override
	public void deliver() {
		// TODO Auto-generated method stub
	System.out.println("Spots Car Delivered");
	}
}
