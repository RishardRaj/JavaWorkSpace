package com.apps.atm;

import java.io.PrintWriter;

public class InvalidDenominationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void printStackTrace(PrintWriter printWriter) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException("Cash Should be multiples of 100");
	}
}// class
