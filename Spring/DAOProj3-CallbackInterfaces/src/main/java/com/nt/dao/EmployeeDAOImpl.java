package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMP_DETAILS_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_DETAILS_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public EmployeeBO getEmpDetailsByNo(int eno) {
	   EmployeeBO  bo=null;
	   //execute the Query
	   bo=jt.queryForObject(GET_EMP_DETAILS_BY_NO, 
			                                       new EmployeeMapper(),
			                                       eno);
			                                       
	   
		return bo;
	}
	
	private static class  EmployeeMapper implements RowMapper<EmployeeBO>{

		public EmployeeBO mapRow(ResultSet rs, int index) throws SQLException {
		   EmployeeBO bo=null;
		   //copy the record of ReusltSEt to BO class obj
		   bo=new EmployeeBO();
		   bo.setNo(rs.getInt(1));
		   bo.setName(rs.getString(2));
		   bo.setJob(rs.getString(3));
		   bo.setSalary(rs.getFloat(4));
			return bo;
		}//mapRow(-,-)
		
	}//innerClass

	public List<EmployeeBO> getEmpDetailsByDesg(String desg) {
		List<EmployeeBO> listBO=null;
		//execute the Query
		listBO=jt.query(GET_EMP_DETAILS_BY_DESG, 
				                        new ResultSetExtractor<List<EmployeeBO>>(){
			
			 public List<EmployeeBO> extractData(ResultSet rs)
					throws SQLException, DataAccessException {
				 List<EmployeeBO> listBO=null;
					EmployeeBO bo=null;
					//process the ResultSet
					listBO=new ArrayList<EmployeeBO>();
					while(rs.next()){
						bo=new EmployeeBO();
						//copy each Record of ResultSet to BO
						bo.setNo(rs.getInt(1));
						bo.setName(rs.getString(2));
						bo.setJob(rs.getString(3));
						bo.setSalary(rs.getFloat(4));
						//add BO to List collection
						listBO.add(bo);
					}//while
					return listBO;
			}//extractData(-)
		 },
	   desg);
		
		return listBO;
	}
	
	/*private static class EmployeeExtractor implements  ResultSetExtractor<List<EmployeeBO>>{

		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<EmployeeBO> listBO=null;
			EmployeeBO bo=null;
			//process the ResultSet
			listBO=new ArrayList<EmployeeBO>();
			while(rs.next()){
				bo=new EmployeeBO();
				//copy each Record of ResultSet to BO
				bo.setNo(rs.getInt(1));
				bo.setName(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSalary(rs.getFloat(4));
				//add BO to List collection
				listBO.add(bo);
			}//while
			return listBO;
		}//mehod
		
	}//innerclass
	*/
}//outer class
