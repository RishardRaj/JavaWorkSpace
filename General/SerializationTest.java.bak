//SerializableDemo.java
package com.nt.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//Cat.java
import java.io.Serializable;

class Cat implements Serializable {
	int c = 30;
	static int d = 50;
}

//Rat.java

 class Rat implements Serializable {
	int e = 60;
	int h = 504;
}

//Dog.java

class Dog implements Serializable{
	int i = 10;
	int j = 20;
}

public class SerializationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		Rat rat = new Rat();
		try {
			// Serialization Process
			FileOutputStream fileOutputStream = new FileOutputStream("dog.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(dog);
			objectOutputStream.writeObject(cat);
			objectOutputStream.writeObject(rat);
			// Deserialization Process
			FileInputStream fileInputStream = new FileInputStream("dog.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Object object = objectInputStream.readObject();
			if (object instanceof Dog) {
				Dog dog2 = (Dog) object;
				System.out.println(dog2.i + "---------------" + dog2.j);
			} else if (object instanceof Cat) {
				Cat cat2 = (Cat) object;
				System.out.println(cat2.c + "---------------" + cat2.d);
			} else {
				Rat rat2 = (Rat) object;
				System.out.println(rat2.e + "  " + rat2.h);
			}
			//
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException classNotFoundException) {
			// TODO Auto-generated catch block
			classNotFoundException.printStackTrace();
		}
	}

}
