//IceCreamDecorator.java
package com.nt.decorator;

public abstract class IceCreamDecorator implements IceCream {
	private IceCream iceCream;

	public IceCreamDecorator(IceCream iceCream) {
		super();			
		this.iceCream = iceCream;
	}

	public void prepare() {
		iceCream.prepare();
	}
}
