package com.nt.scjp;

class ConstructorTest {
		private static  int counter = 0;

		public static int getInstanceCount() {
			return counter;
		}

		public ConstructorTest() {
			counter++;
		}
	}

public class ConstructorTestApp {
	public static void main(String[] args) {
		ConstructorTest constructorTest1, constructorTest2, constructorTest3 = null;
		constructorTest1 = new ConstructorTest();
		constructorTest2 = new ConstructorTest();
		constructorTest3 = new ConstructorTest();
		System.out.println(ConstructorTest.getInstanceCount());
	}
}
