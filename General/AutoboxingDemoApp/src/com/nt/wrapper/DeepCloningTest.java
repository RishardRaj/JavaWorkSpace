//DeepCloningTest.java
package com.nt.wrapper;

public class DeepCloningTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat_D cat_D = new Cat_D(20);
		Dog_D dog_D = new Dog_D(10, cat_D);
		System.out.println(dog_D.i + "=================" + dog_D.cat_D.j);
		Dog_D dog_D2 = (Dog_D) dog_D.clone();
		dog_D2.i = 8888;
		dog_D2.cat_D.j = 9999;
		System.out.println(dog_D.i + "-------------" + dog_D.cat_D.j);
	}

}
