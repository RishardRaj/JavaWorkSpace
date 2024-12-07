//ShallowCloningTest.java
package com.nt.wrapper;

public class ShallowCloningTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Cat cat = new Cat(20);
		Dog dog = new Dog(cat, 10);
		System.out.println(dog.i + "-------" + dog.cat.j);
		Dog dog2 = (Dog) dog.clone();
		dog2.i = 8888;
		dog2.cat.j = 9999;
		System.out.println(dog.i + "===============" + dog.cat.j);
	}// main

}// class
