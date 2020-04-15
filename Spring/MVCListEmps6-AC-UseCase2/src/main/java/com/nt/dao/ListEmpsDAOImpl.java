package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nt.bo.EmployeeBO;

public class ListEmpsDAOImpl implements ListEmpsDAO {
	private static final  String  GET_ALL_EMPS="SELECT EMPNO,ENAME,JOB,SAL FROM EMP";
	
     private JdbcTemplate jt;
     
     public void setJt(JdbcTemplate jt) {
 		this.jt = jt;
 	}
    
	@Override
	public List<EmployeeBO> retriveEmps() {
		List<EmployeeBO> listBO=null;
		listBO=jt.query(GET_ALL_EMPS, new EmployeeExtractor());
		return listBO;
	}//retriveEmps
	private static class EmployeeExtractor implements ResultSetExtractor<List<EmployeeBO>>{

		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			 List<EmployeeBO> listBO=null;
			 EmployeeBO bo=null;
			 
			 listBO=new ArrayList<EmployeeBO>();
			 while(rs.next()){
				bo=new EmployeeBO();
				bo.setNo(rs.getInt(1));
				bo.setName(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSalary(rs.getInt(4));
				listBO.add(bo);
			 }//while
			 
			return listBO;
		}//etractData
	}//innerClass
}//class
