package com.nt.beans;

import java.beans.ConstructorProperties;

public class Marks {
	private int m1;
	private int m2;
	private int m3;
	
	@ConstructorProperties(value={"mk1","mk2","mk3"})
	public Marks(int mk1, int mk2, int mk3) {
	  System.out.println("Marks:3-param constructor");
		this.m1 = mk1;
		this.m2 = mk2;
		this.m3 = mk3;
	}
	@Override
	public String toString() {
		return "Marks [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	
	
	

}
