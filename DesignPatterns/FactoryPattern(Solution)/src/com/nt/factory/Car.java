//Car.java
package com.nt.factory;

public class Car {
	private String model;
	private String engineCC;

	public void assemble() {
		System.out.println("Normal Car Assembled");
	}

	public void roadTest() {
		System.out.println("Normal Car Road Tested");
	}

	public void deliver() {
		System.out.println("Normal Car Delivered");
	}
}
