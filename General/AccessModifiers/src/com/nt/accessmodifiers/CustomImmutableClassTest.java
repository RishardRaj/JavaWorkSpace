//CustomImmutablityClassTest.java
package com.nt.accessmodifiers;

public class CustomImmutableClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomImmutableClass customImmutableClass1 = new CustomImmutableClass(10);
		CustomImmutableClass customImmutableClass2 = customImmutableClass1.modify(150);
		CustomImmutableClass customImmutableClass3 = customImmutableClass1.modify(10);
		System.out.println(customImmutableClass1 == customImmutableClass2);
		System.out.println(customImmutableClass1 == customImmutableClass3);
	}

}
