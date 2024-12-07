package com.nt.scjp;

public class ConstructorTestApp {
	public static void main(String[] args) {
		ConstructorTest constructorTest1, constructorTest2, constructorTest3 = null;
		constructorTest1 = new ConstructorTest();
		constructorTest2 = new ConstructorTest();
		constructorTest3 = new ConstructorTest();
		System.out.println(ConstructorTest.getInstanceCount());
	}
}
