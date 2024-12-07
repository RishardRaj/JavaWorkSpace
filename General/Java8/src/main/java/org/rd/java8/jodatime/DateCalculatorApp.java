package org.rd.java8.jodatime;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class DateCalculatorApp {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
	}
}
