//IceCreamStore.java
package com.nt.client;

import com.nt.decorator.ButterScotchIceCream;
import com.nt.decorator.DryFruitButterScotchIceCream;
import com.nt.decorator.HoneyVanillaIceCream;
import com.nt.decorator.IceCream;
import com.nt.decorator.VanillaIceCream;

public class IceCreamStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IceCream iceCream = null;
		iceCream = new VanillaIceCream();
		iceCream.prepare();
		System.out.println("--------------");
		iceCream = new ButterScotchIceCream();
		iceCream.prepare();
		System.out.println("====================");
		iceCream = new HoneyVanillaIceCream();
		iceCream.prepare();
		System.out.println("================");
		iceCream = new DryFruitButterScotchIceCream();
		iceCream.prepare();
		System.out.println("==============");
	}

}
