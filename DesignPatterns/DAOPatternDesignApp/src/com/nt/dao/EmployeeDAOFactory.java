//EmployeeDAOFactory.java
package com.nt.dao;

public class EmployeeDAOFactory {
	public static EmployeeDAO createEmployeeDAOImpl(String type) {
		if (type.equalsIgnoreCase("HREmployeeDAOImpl"))
			return HREmployeeDAOImpl();
		else
			return FinanceEmployeeDAOImpl();
	}// method
}// class
