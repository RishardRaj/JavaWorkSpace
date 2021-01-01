package com.nt.beans;

import java.io.Serializable;

//Student.java
public class Student implements Serializable {
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	private Integer id;
	private String name;
	private String address;

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
