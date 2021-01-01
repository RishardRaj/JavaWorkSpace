//DryFruitCreamDecorator.jav
package com.nt.decorator;

public class DryFruitIceCreamDecorator extends IceCreamDecorator {
	private IceCream iceCream;

	public DryFruitIceCreamDecorator(IceCream iceCream) {
		super(iceCream);
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.prepare();
		addDryFruit();
	}

	private void addDryFruit() {
		System.out.println("Adding DryFruit to the your requested IceCream");
	}
}
