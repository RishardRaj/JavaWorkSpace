//CarFactory.java
package com.nt.factory;

import javax.print.attribute.standard.RequestingUserName;

public class CarFactory {
	public static Car getCar(String carType) {
		Car car = null;
		if (carType.equals("Luxory")) {
			car = new LuxoryCar();
		}
		if (carType.equals("Sports")) {
			car = new SportsCar();
		}
		if (carType.equals("standard")) {
			car = new Car();
		}
		car.assemble();
		car.roadTest();
		car.deliver();
		return car;
	}
}
