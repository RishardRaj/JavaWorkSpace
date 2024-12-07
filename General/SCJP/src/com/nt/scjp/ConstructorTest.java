package com.nt.scjp;

public class ConstructorTest {
		private static int counter = 0;

		public static int getInstanceCount() {
			return counter;
		}

		public ConstructorTest() {
			counter++;
		}
	}

