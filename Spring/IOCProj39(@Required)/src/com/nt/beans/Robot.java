package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;

public class Robot {
	private  int id;
	private String type;
	private  Date doc;
	
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Required
	public void setDoc(Date doc) {
		this.doc = doc;
	}
	@Override
	public String toString() {
		return "Robot [id=" + id + ", type=" + type + ", doc=" + doc + "]";
	}

}
