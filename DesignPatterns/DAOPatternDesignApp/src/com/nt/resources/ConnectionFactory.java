//ConnectionFactory.java
package com.nt.resources;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionFactory {
	public static Connection getConnection() throws SQLException, NamingException {
		Connection connection = null;
		InitialContext initialContext = null;
		DataSource dataSource = null;
		// Creation of Server Managed Connection Pool
		// create InitalContext obj
		initialContext = new InitialContext();
		// create DataSource obj having jndi name configured in tomcat server
		dataSource = (DataSource) initialContext.lookup("java:/comp/env/myJndi");
		connection = dataSource.getConnection();
		return connection;
	}// method
}// class
