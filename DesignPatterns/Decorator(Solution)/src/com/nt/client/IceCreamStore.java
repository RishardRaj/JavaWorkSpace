//IceCreamStore.java
package com.nt.client;

import com.nt.decorator.ButterScotchIceCream;
import com.nt.decorator.DryFruitIceCreamDecorator;
import com.nt.decorator.HoneyIceCreamDecorator;
import com.nt.decorator.IceCream;
import com.nt.decorator.IceCreamDecorator;
import com.nt.decorator.VanillaIceCream;

public class IceCreamStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IceCream iceCream = null;
		IceCreamDecorator iceCreamDecorator = null;
		iceCream = new VanillaIceCream();
		iceCream.prepare();
		System.out.println("-------------------");
		iceCream = new ButterScotchIceCream();
		iceCream.prepare();
		System.out.println("-----------------");
		iceCream = new VanillaIceCream();
		iceCreamDecorator = new HoneyIceCreamDecorator(iceCream);
		iceCreamDecorator.prepare();
		System.out.println("======================");
		iceCream = new ButterScotchIceCream();
		iceCreamDecorator = new DryFruitIceCreamDecorator(iceCream);
		iceCreamDecorator.prepare();
	}

}
