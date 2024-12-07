//Dog_D.java
package com.nt.wrapper;

public class Dog_D implements Cloneable{
	int i;
	Cat_D cat_D;

	public Dog_D(int i, Cat_D cat_D) {
		super();
		this.i = i;
		this.cat_D = cat_D;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Cat_D cat_D1 = new Cat_D(cat_D.j);
		Dog_D dog_D = new Dog_D(i, cat_D1);
		return dog_D;
	}
}
