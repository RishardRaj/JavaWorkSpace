package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Viechle {
	// @Autowired
	private Engine engg;

	@Autowired(required = true)
	public Viechle(Engine engg) {
		System.out.println("constructor");
		this.engg = engg;
	}

	@Autowired(required = true)
	// @Qualifier(value="com.nt.beans.Engine#0")
	// @Qualifier(value="eng")

	@Qualifier("e1")

	public void setEngg(Engine engg) {
		System.out.println("setEngg(-)");
		this.engg = engg;
	}

	/*
	 * @Autowired public void assign(Engine engg){
	 * System.out.println("assign(-)"); this.engg=engg; }
	 */

	@Override
	public String toString() {
		return "Viechle [engg=" + engg + "]";
	}

}
