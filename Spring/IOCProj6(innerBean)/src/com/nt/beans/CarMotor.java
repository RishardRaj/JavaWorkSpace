package com.nt.beans;

public class CarMotor {
	private Belt  belt;
	public void setBelt(Belt belt) {
		this.belt = belt;
	}
	@Override
	public String toString() {
		return "CarMotor [belt=" + belt + "]";
	}


}
