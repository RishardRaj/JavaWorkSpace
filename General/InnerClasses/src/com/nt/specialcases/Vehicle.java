package com.nt.specialcases;

public interface Vehicle {
	public int getNoofWheels();

	class DefaultVehicle implements Vehicle {

		@Override
		public int getNoofWheels() {
			// TODO Auto-generated method stub
			return 2;
		}

	}
}
