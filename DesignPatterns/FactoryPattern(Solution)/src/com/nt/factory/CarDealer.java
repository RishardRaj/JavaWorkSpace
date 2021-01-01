//CarDealer.java
package com.nt.factory;

public class CarDealer {
	public static void main(String[] args) {
		Car car, car1 = null;
		car = CarFactory.getCar("standard");
		car1 = CarFactory.getCar("Luxory");
	}
}
