//SerializableDemo.java
package com.nt.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {

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

			Dog dog2 = (Dog) objectInputStream.readObject();
			Cat cat2 = (Cat) objectInputStream.readObject();
			Rat rat2 = (Rat) objectInputStream.readObject();
			System.out.println(dog2.i + " " + dog2.j);
			System.out.println(cat2.c + "  " + cat2.d);
			System.out.println(rat2.e + "  " + rat2.h);
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
