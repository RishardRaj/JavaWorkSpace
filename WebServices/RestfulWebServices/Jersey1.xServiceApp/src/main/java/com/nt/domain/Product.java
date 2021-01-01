//Product.java
package com.nt.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	private int pId;
	private String pName;
	private float price;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", price=" + price + "]";
	}

}
