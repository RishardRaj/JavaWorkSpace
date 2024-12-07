//Cat_D.java
package com.nt.wrapper;

 class Cat_D {
	int j;

	public Cat_D(int j) {
		/*super();*/
		this.j = j;
	}

}//class
//Dog_D.java

 class Dog_D implements Cloneable{
	int i;
	Cat_D cat_D;

	public Dog_D(int i, Cat_D cat_D) {
		/*super();*/
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
//DeepCloningTest.java

public class DeepCloningTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat_D cat_D=new Cat_D(20);
		Dog_D dog_D=new Dog_D(10, cat_D);
		System.out.println(dog_D.i+"================="+dog_D.cat_D.j);
		Dog_D dog_D2=(Dog_D) dog_D.clone();
		dog_D2.i=8888;
		dog_D2.cat_D.j=9999;
		System.out.println(dog_D.i+"-------------"+dog_D.cat_D.j);
	}
}
