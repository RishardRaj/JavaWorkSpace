package com.nt.factory;

public class LuxoryCar extends Car {
	private String acType;

	@Override
	public void assemble() {
		System.out.println("Luxory Car Assembled");
	}

	@Override
	public void roadTest() {
		// TODO Auto-generated method stub
		System.out.println("Luxory Car Road Tested");
	}

	@Override
	public void deliver() {
		// TODO Auto-generated method stub
		System.out.println("Luxory Car Delivered");
	}
}
