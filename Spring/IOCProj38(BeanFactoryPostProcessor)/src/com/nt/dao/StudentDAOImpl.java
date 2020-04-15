package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String STUDENT_INSERT_QUERY = "INSERT INTO SP_STUDENT(SNO,SNAME,TOTAL,AVG,RESULT) VALUES(?,?,?,?,?)";
	private DataSource ds;

	// sett method for setter injection
	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(StudentBO bo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int count = 0;
		// get con obj from jdbc con pool
		con = ds.getConnection();
		// get PreparedSatement obj
		ps = con.prepareStatement(STUDENT_INSERT_QUERY);
		// set Query param values
		ps.setInt(1, bo.getSno());
		ps.setString(2, bo.getSname());
		ps.setInt(3, bo.getTotal());
		ps.setFloat(4, bo.getAvg());
		ps.setString(5, bo.getResult());
		// exeute SQL Query
		count = ps.executeUpdate();
		return count;
	}// method

}
