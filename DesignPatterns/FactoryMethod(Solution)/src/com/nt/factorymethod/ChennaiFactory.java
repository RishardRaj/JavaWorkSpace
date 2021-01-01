//ChennaiFactory.java
package com.nt.factorymethod;

public class ChennaiFactory extends BikeFactory {
	@Override
	public void paint() {
		System.out.println("Finished Painting");
	}

	@Override
	public void assemble() {
		System.out.println("Finished Assembling");
	}

	@Override
	public void test() {
		System.out.println("Finished Testing");
	}

	public static Bike createBike(String bikeType) {
		Bike bike = null;
		if (bikeType.equals("pulsor")) {
			bike = new Pulsor();
		}
		if (bikeType.equals("discover")) {
			bike = new Discover();
		}
		return bike;
	}
}
