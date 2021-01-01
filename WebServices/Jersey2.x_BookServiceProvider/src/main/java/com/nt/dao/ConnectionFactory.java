//ConnectionFactory.java
package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} // try
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // catch
	}// static

	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "system";
		String password = "manager";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, userName, password);
		} // try
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // catch
		return connection;
	}// method
}// class


