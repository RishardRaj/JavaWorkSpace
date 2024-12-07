//TooYoungException.java
package com.nt.customexceptions;

public class TooYoungException extends RuntimeException {
	String message;

	public TooYoungException(String message) {
		super(message);
	}

}
