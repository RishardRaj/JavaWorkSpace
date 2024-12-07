//Test.java
package com.nt.jvm;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int count = 0;
			Class clazz = Class.forName("com.nt.jvm.Student");
			Method method[] = clazz.getDeclaredMethods();
			for (Method method1 : method) {
				count++;
				System.out.println(method1.getName());
			}
			System.out.println("Total the no.of Methods are:" + count);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
