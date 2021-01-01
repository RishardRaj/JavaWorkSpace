//ResponseDTO.java
package com.nt.conversion;

public class ResponseDTO {
	private byte status;
	private String message;

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
