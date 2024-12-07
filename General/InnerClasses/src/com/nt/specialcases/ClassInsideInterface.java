//ClassInsideInteface.java
package com.nt.specialcases;

import com.nt.specialcases.Vehicle.DefaultVehicle;

public class ClassInsideInterface {
	public static void main(String[] args) {

		Vehicle.DefaultVehicle defaultVehicle = new Vehicle.DefaultVehicle();
		DefaultVehicle  defaultVehicle2=new DefaultVehicle();
		System.out.println("Every class declared inside the interface is public and static.So can access class without interface reference varible"+defaultVehicle2.getNoofWheels());
		System.out.println(defaultVehicle.getNoofWheels());
		Bus bus = new Bus();
		System.out.println(bus.getNoofWheels());
	}
}
