//Dog.java
package com.nt.wrapper;

public class Dog implements Cloneable{
	Cat cat;
	int i;

	public Dog(Cat cat, int i) {
		super();
		this.cat = cat;
		this.i = i;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
