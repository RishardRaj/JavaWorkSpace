//VehicleTypes.java
package com.nt.specialcases;

public class VehicleTypes {
	interface Vehicle {
		public int noofwheels();
	}

	class Bus implements Vehicle {

		@Override
		public int noofwheels() {
			// TODO Auto-generated method stub
			return 7;
		}

	}

	class Auto implements Vehicle {

		@Override
		public int noofwheels() {
			// TODO Auto-generated method stub
			return 4;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new VehicleTypes().new Bus();
		System.out.println(bus.noofwheels());
		Auto auto = new VehicleTypes().new Auto();
		System.out.println(auto.noofwheels());
	}

}
