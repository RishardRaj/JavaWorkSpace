//CustomGenericApp.java
package com.nt.generic;

public class CustomGenericApp<T> {
	private T object;

	public CustomGenericApp(T object) {
		this.object = object;
	}

	public void show() {
		System.out.println("Fully Qualified Name of the given class" + object.getClass().getName());
	}

	public T getObject() {
		return object;
	}

}
