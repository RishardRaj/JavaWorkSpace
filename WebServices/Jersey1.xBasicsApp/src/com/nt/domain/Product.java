//Product.java
package com.nt.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	private int pid;
	private String pname;
	private float price;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}//class
