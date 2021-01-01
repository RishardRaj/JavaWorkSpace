//EmployeeDAO.java
package com.nt.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.nt.bo.FinanceEmployeeBO;
import com.nt.bo.HREmployeeBO;

public interface EmployeeDAO {
	public void register(HREmployeeBO hrEmployeeBO, Connection connection) throws SQLException, NamingException;
	public void register(FinanceEmployeeBO financeEmployeeBO, Connection connection) throws SQLException, NamingException;
}// interface