package com.nt.dto;

import java.io.Serializable;

public class BatsmanIdDetailsDTO implements Serializable {
	private int batsmanId;
	private String nickName;
	private String country;
	private String fullName;
	public int getBatsmanId() {
		return batsmanId;
	}
	public void setBatsmanId(int batsmanId) {
		this.batsmanId = batsmanId;
	}
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
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



}
