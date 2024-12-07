//CashDispenseTest.java

package com.apps.atm;

public class CashDispenseTest {
	public static void main(String[] args) {
		try {
			CashDispense.dispense(37700.0f);
		} catch (InvalidDenominationException invalidDenominationException) {
			// TODO Auto-generated catch block
			invalidDenominationException.printStackTrace();
		}
	}
}
