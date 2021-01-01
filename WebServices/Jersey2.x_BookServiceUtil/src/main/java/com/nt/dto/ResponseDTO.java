//ResponseDTO.java
package com.nt.dto;

public class ResponseDTO {

	private byte status;
	private int data;
	private String message;

	public byte getStatus() {
		return status;
	}
	public void setStatus(byte status) {
		this.status = status;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}// class
