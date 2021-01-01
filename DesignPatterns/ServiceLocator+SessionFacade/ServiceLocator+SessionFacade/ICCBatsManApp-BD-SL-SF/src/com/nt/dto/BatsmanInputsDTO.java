package com.nt.dto;

import java.io.Serializable;

public class BatsmanInputsDTO implements Serializable {
	private String nickName;
	private String country;

	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
