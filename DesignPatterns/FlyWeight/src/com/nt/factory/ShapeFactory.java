//ShapeFactory.java
package com.nt.factory;

import java.util.HashMap;
import java.util.Map;

import com.nt.flyweight.Circle;
import com.nt.flyweight.Shape;
import com.nt.flyweight.Square;

public class ShapeFactory {
	private static Map<String, Shape> shapeCache = new HashMap<>();

	public static synchronized Shape getShape(String shapeType) {
		if (!shapeCache.containsKey(shapeType)) {
			if (shapeType.equalsIgnoreCase("Square")) {
				Square square = null;
				square = new Square();
				shapeCache.put(shapeType, square);
			} // if
			else if (shapeType.equalsIgnoreCase("Circle")) {
				Circle circle = null;
				circle = new Circle();
				shapeCache.put(shapeType, circle);
			} // else if
			return shapeCache.get(shapeType);
		} // if
		else {
			return shapeCache.get(shapeType);
		} // else
	}// method
}// class