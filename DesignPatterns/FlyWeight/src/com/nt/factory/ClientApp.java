//ClientApp.java
package com.nt.factory;

import com.nt.flyweight.Shape;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int size = 500;
		Shape shape = null;
		for (int i = 0; i < size; i++) {
			shape = ShapeFactory.getShape("Square");
			shape.draw(i, "White" + i, "Dashed" + i);
		}
		System.out.println("-----------------------");
		for (int i = 0; i < size; i++) {
			shape = ShapeFactory.getShape("Circle");
			shape.draw(i, "Black" + i, "Dotted" + i);
		}
	}

}
