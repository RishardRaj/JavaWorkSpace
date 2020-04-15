package com.nt.beans;

public class AddressInfo {
	private String street;
	private String area;
	private String city;
	public void setStreet(String street) {
		this.street = street;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "AddressInfo [street=" + street + ", area=" + area + ", city=" + city + "]";
	}

}
