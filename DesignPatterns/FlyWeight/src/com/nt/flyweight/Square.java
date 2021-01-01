//Square.java
package com.nt.flyweight;

public class Square implements Shape {
	private String label;

	public Square() {
		label = "square";
		System.out.println("Square 0-Param Constructor");
	}

	public void draw(int side, String fillColor, String lineStyle) {
		// TODO Auto-generated method stub
		System.out.println("Drawing" + label + "with fill color" + fillColor + "and having side" + side + "by lineStyle"
				+ lineStyle);
	}

}
