//NagFactory.java
package com.nt.factorymethod;

public class NagpurFactory {
	public static void paint() {
		System.out.println("Finished Painting");
	}

	public static void assemble() {
		System.out.println("Finished Assembling");
	}

	public static void test() {
		System.out.println("Finished Testing");
	}

	public static Bike createBike(String bikeModel) {
		Bike bike = null;
		if (bikeModel.equals("Pulsor")) {
			bike = new Pulsor();
			System.out.println("Creating Pulsor Bike");
		}
		if (bikeModel.equals("Discover")) {
			bike = new Discover();
			System.out.println("Creating Discover Bike");
		}
		paint();
		assemble();
		test();
		return bike;
	}
}
