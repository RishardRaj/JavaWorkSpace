//HREmployeeDAOImpl.java
package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.nt.bo.HREmployeeBO;

public class HREmployeeDAOImpl implements EmployeeDAO {
private static final String EMployee_Insert_Query="Insert into employee_table values(?,?,?,?)";
	@Override
	public void register(HREmployeeBO employeeBO, Connection connection) {
		// TODO Auto-generated method stub
	//Get connection from ConnectionFactory
		PreparedStatement preparedStatement=null;
		//Create PreparedStatement Object
		preparedStatement=connection.prepareStatement(EMployee_Insert_Query);
		
		return null;
	}

}
