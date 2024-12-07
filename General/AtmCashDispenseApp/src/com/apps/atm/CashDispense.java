//CashDispense.java
package com.apps.atm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CashDispense {

	public static void dispense(Float denomination) throws InvalidDenominationException {
		int Thousands = 0;
		int FiveHundreds = 0;
		int Hundreds = 0;
		Properties properties = null;
		properties = new Properties();
		try {
			properties.load((new FileInputStream(
					"D:\\Practices\\JSE\\AtmCashDispenseApp\\src\\com\\apps\\atm\\cash.properties")));
		} catch (FileNotFoundException fileNotFoundException) {
			// TODO Auto-generated catch block
			fileNotFoundException.printStackTrace();
		} catch (IOException ioException) {
			// TODO Auto-generated catch block
			ioException.printStackTrace();
		}
		if (!(denomination == 0) && (denomination % 100 == 0)) {
			int reqThousands = (int) (denomination / 1000);
			Thousands = Integer.parseInt(properties.getProperty("1000Notes"));
			Thousands = Thousands - reqThousands;
			properties.setProperty("1000Notes", "" + Thousands);
			System.out.println("Remaing 1000's" + properties.getProperty("1000Notes"));
			int reqFiveHundreds = (int) ((denomination - reqThousands * 1000) / 500);
			FiveHundreds = Integer.parseInt(properties.getProperty("500Notes"));
			FiveHundreds = FiveHundreds - reqFiveHundreds;
			properties.setProperty("500Notes", "" + FiveHundreds);
			System.out.println("Remaing 500's" + properties.getProperty("500Notes"));
			int reqHundreds = (int) (denomination - ((reqThousands * 1000) + (reqFiveHundreds * 500))) / 100;
			Hundreds = Integer.parseInt(properties.getProperty("100Notes"));
			Hundreds = Hundreds - reqHundreds;
			properties.setProperty("100Notes", "" + Hundreds);
			System.out.println("Remaing 100's" + properties.getProperty("100Notes"));
			System.out.println("Cash is Dispensing......." + reqThousands + "*1000 Notes " + reqFiveHundreds
					+ "*500 Notes " + reqHundreds + "*100 Notes");
		} // if
		else {
			System.out.println("Given Denomination Was Unable to Dispense");
			throw new InvalidDenominationException();
		}
	}
}
