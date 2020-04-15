package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String STUDENT_INSERT_QUERY="INSERT INTO STUDENT VALUES(?,?,?)";
	private static final String GET_STUDETSNS_QUERY="SELECT SNO,SNAME,SADD FROM STUDENT";
	private static final String GET_STUDENT_BY_NO="SELECT SNO,SNAME,SADD FROM STUDENT WHERE SNO=?";
	private static final String UPDATE_STUDENT_BY_NO="UPDATE STUDENT SET SNAME=?,SADD=? WHERE SNO=?";
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int insert(StudentBO bo) {
		int count=0;
		count=jt.update(STUDENT_INSERT_QUERY,bo.getSno(),bo.getSname(),bo.getSadd());
		return count;
	}
	
	@Override
	public List<StudentBO> getAllStudents() {
	   List<StudentBO> listBO=null;
	   listBO=jt.query(GET_STUDETSNS_QUERY, new StudentExtractor());
		return listBO;
	}
	
	private static class StudentExtractor implements ResultSetExtractor<List<StudentBO>>{

		@Override
		public List<StudentBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			 StudentBO bo=null;
			 List<StudentBO> listBO=null;
			 listBO=new ArrayList<StudentBO>();
			 while(rs.next()){
				bo=new StudentBO();
				bo.setSno(rs.getInt(1));
				bo.setSname(rs.getString(2));
				bo.setSadd(rs.getString(3));
				listBO.add(bo);
			 }//while
			return listBO;
		}//extractData(-)
	}//innner clas
	@Override
	public StudentBO getStudentByNo(int no) {
		StudentBO bo=null;
		bo=jt.queryForObject(GET_STUDENT_BY_NO, new StudentMapper(),no);
		return bo;
	}
	
	private  class StudentMapper implements RowMapper<StudentBO>{
		
		@Override
		public StudentBO mapRow(ResultSet rs, int index) throws SQLException {
			StudentBO bo=null;
			bo=new StudentBO();
			bo.setSno(rs.getInt(1));
			bo.setSname(rs.getString(2));
			bo.setSadd(rs.getString(3));
			return bo;
		}
		
	}//inner class
	
	@Override
	public int update(StudentBO bo) {
		int count=0;
	  count=jt.update(UPDATE_STUDENT_BY_NO, bo.getSname(),bo.getSadd(),bo.getSno());
      return count;		
	}
	
}//class
