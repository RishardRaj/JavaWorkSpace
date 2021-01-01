//HoneyIceCreamDecorator.java
package com.nt.decorator;

public class HoneyIceCreamDecorator extends IceCreamDecorator {
	private IceCream iceCream;

	public HoneyIceCreamDecorator(IceCream iceCream) {
		super(iceCream);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() {
		super.prepare();
		addHoney();
	}

	public void addHoney() {
		System.out.println("Adding Honey to the your requested IceCream");
	}
}
