//CarDealer.java
package com.nt.factory;

public class CarDealer {
	public static void main(String[] args) {
		Car car = null;
		car = new Car();
		car.assemble();
		car.roadTest();
		car.deliver();
		car = new LuxoryCar();
		car.assemble();
		car.roadTest();
		car.deliver();
		System.out.println("In this scenario car dealer must know car creation logic");
	}
}
