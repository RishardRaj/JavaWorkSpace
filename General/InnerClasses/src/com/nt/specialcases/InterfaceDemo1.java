//InterfaceDemo1.java
package com.nt.specialcases;


import com.nt.specialcases.Outer.Inner;

public class InterfaceDemo1 implements Inner {

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println(
				"Eventhough multiple interfaces declared one inside another we can implement all these interfaces independently ");
	}

}
