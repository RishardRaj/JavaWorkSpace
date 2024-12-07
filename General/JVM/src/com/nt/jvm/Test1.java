//Test1.java
package com.nt.jvm;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		Class clazz1 = student1.getClass();
		Student student2 = new Student();
		Class clazz2 = student2.getClass();
		System.out.println(clazz1.hashCode());
		System.out.println(clazz2.hashCode());
		System.out.println(clazz1 == clazz2);
	}

}
