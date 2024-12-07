//GetClassDemo.java
package com.nt.wrapper;

import java.lang.reflect.Method;

public class GetClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Object object = new String("Raj");
		Class clazz = object.getClass();
		System.out.println("Class Name" + clazz.getName());
		Method[] method = clazz.getDeclaredMethods();
		for (Method method2 : method) {
			System.out.println("Methods" + method2.getName());
			count++;
		}
		System.out.println(count);
	}

}
