//ClassResolutionTest.java
package com.nt.accessmodifiers;

import java.util.Date;
import java.sql.*;

public class ClassResolutionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date.getClass().getName());
	}
}
