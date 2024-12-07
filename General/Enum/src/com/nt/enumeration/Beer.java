//Beer.java
package com.nt.enumeration;

public enum Beer {
	KF(100), RC(69), KO(100), FO(30), TG(125), KALYANI	;
	int price;

	Beer() {
		// TODO Auto-generated constructor stub
		System.out.println("0-param");
		this.price = 125;
	}

	Beer(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}
