package com.nt.beans;

public class Bike {
	 private String bikeId;
	 private String type;
	 private String engineCC;
	 private String color;
	public String getBikeId() {
		return bikeId;
	}
	public void setBikeId(String bikeId) {
		this.bikeId = bikeId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Bike [bikeId=" + bikeId + ", type=" + type + ", engineCC=" + engineCC + ", color=" + color + "]";
	}
	
	 
}
