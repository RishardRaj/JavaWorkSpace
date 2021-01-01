//DryFruitButterScotchIceCream.java
package com.nt.decorator;

public class DryFruitButterScotchIceCream extends ButterScotchIceCream {
	public void prepare() {
		super.prepare();
		addDryFruit();
	}

	private void addDryFruit() {
		System.out.println("Adding Dry Fruit to your requested IceCream");
	}
}
