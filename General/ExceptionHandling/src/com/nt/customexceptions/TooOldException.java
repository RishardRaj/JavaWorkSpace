//TooYoungException.java
package com.nt.customexceptions;

public class TooOldException extends RuntimeException {
	String message;

	public TooOldException(String message) {
		super(message);
	}

}
