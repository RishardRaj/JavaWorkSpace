package com.nt.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
  private static final String  STUDENT_INSERT_QUERY="INSERT INTO STUDENT VALUES(?,?,?)";
  private JdbcTemplate  jt;
  
	public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}

	public int[] bulkInsert(List<StudentBO> listBO) {
		int result[]=null;
		//execute the Query for batch processing
		result=jt.batchUpdate(STUDENT_INSERT_QUERY,new StudentBatchSetter(listBO));
		return result;
	}
	
	private static class  StudentBatchSetter implements BatchPreparedStatementSetter{
     private List<StudentBO> listBO;
     
     public StudentBatchSetter(List<StudentBO> listBO){
    	 this.listBO=listBO;
     }
		
		public int getBatchSize() {
			//decide batchsize
			return listBO.size();
		}

		public void setValues(PreparedStatement ps, int i) throws SQLException {
			//set  query param values to batch
			ps.setInt(1,listBO.get(i).getSno());
			ps.setString(2,listBO.get(i).getSname());
			ps.setString(3, listBO.get(i).getSadd());
			
			
		}
		
		
	}

}
