//EnumTest.java
package com.nt.enumeration;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beer beer = null;
		beer = Beer.RC;
		switch (beer) {
		case KF:
			System.out.println("It's Childrens Brand");
			break;
		case RC:
			System.out.println("It's Too Hot");
			break;
		case KO:
			System.out.println("It's too lite");
			break;
		default:
			System.out.println("Other Brands are not good");
		}
		System.out.println(beer);
		Beer[] beerList = Beer.values();
		for (Beer b1 : beerList) {
			System.out.println(b1 + "--------------" + b1.getPrice());
		}

		Fish fish = Fish.STAR;
		System.out.println(fish);
	}

}
