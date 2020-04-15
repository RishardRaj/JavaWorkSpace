package com.nt.beans;

public class Belt {
	 private String beltType;
	  private int size;
	public String getBeltType() {
		return beltType;
	}
	public void setBeltType(String beltType) {
		this.beltType = beltType;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Belt [beltType=" + beltType + ", size=" + size + "]";
	}
	
	
	  
}
