//ChennaiFactory.java
package com.nt.factorymethod;

public class ChennaiFactory {
	public static void paint() {
		System.out.println("Finished Painting");
	}

	public static void assemble() {
		System.out.println("Finished Assembling");
	}

	public static void test() {
		System.out.println("Finished Testing");
	}
public static Bike createBike(String bikeType){
	Bike bike=null;
	if(bikeType.equals("pulsor")){
		bike=new Pulsor();
	}
	if(bikeType.equals("discover")){
		bike=new Discover();
	}
	assemble();
	paint();
	test();
	return bike;
}
}
