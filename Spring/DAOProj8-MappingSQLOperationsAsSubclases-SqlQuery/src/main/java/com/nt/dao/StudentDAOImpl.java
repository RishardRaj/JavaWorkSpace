package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	  private static final String GET_STUDENTS_BY_ADDRS="SELECT SNO,SNAME,SADD FROM STUDENT WHERE SADD=?";
	private DataSource ds;
	private StudentSelector stSelector=null;
	
	  public StudentDAOImpl(DataSource ds) {
		this.ds = ds;
		stSelector=new StudentSelector(ds,GET_STUDENTS_BY_ADDRS);
		
	}

	  
	public List<StudentBO> getStudentByAddrs(String addrs) {
		List<StudentBO> listBO=null;
		//use Inner and sub class obj
		listBO=stSelector.findStudentsByAddrs(addrs);
			return listBO;
	}
	
	private static  class StudentSelector extends MappingSqlQuery<StudentBO>{
		
		public  StudentSelector(DataSource ds,String query){
			super(ds,query);
			super.declareParameter(new SqlParameter(Types.VARCHAR));
			super.compile();
		}

		@Override
		protected StudentBO mapRow(ResultSet rs, int index) throws SQLException {
			StudentBO bo=null;
			System.out.println("StudentSelector: mapRow(-,-)");
			//get each Record from ResultSet obj and map with StudentBO class obj
			bo=new StudentBO();
			bo.setSno(rs.getInt(1));
			bo.setSname(rs.getString(2));
			bo.setSadd(rs.getString(3));
			return bo;
		}//mapRow(-,-)
		
		public List<StudentBO>  findStudentsByAddrs(String addrs){
			List<StudentBO> listBO=null;
			//use execute(-) method
			listBO=super.execute(addrs);
			return listBO;
		}//method
		
	}//class
	
}
