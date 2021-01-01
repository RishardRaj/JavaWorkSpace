//HoneyVanillaIceCream.java
package com.nt.decorator;

public class HoneyVanillaIceCream extends VanillaIceCream {
	public void prepare() {
		super.prepare();
		addHoney();
	}

	private void addHoney() {
		System.out.println("Adding honey to the your requested Ice Cream");
	}
}
