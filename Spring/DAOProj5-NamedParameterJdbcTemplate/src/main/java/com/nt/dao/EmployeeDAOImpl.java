package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMP_NAME_BY_NO="SELECT ENAME FROM EMP WHERE EMPNO=:no";
	private static final String GET_EMP_DETAILS_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=:no";
    private static final String  INSERT_EMP_DETAILS="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL) VALUES(:eno,:ename,:job,:salary)";		
	private NamedParameterJdbcTemplate njt;
	
	public void setNjt(NamedParameterJdbcTemplate njt) {
		this.njt = njt;
	}
	
	public String findName(int eno) {
		Map<String,Object> map=null;
		String name=null;
	    //prepare param values (as Map)
		map=new HashMap<String,Object>();
		map.put("no",eno);
		//execute query
		name=njt.queryForObject(GET_EMP_NAME_BY_NO, map,String.class);
		return name;
	}
	public EmployeeBO findEmpDetails(int eno) {
		MapSqlParameterSource map=null;
		EmployeeBO bo=null;
	    //prepare param values
		map=new MapSqlParameterSource();
		map.addValue("no",eno);
		//execute Query
		bo=njt.queryForObject(GET_EMP_DETAILS_BY_NO, map,
				                                      new RowMapper<EmployeeBO>(){

														public EmployeeBO mapRow(ResultSet rs, int index)
																throws SQLException {
															EmployeeBO bo=null;
															//copy the record of ResultSet obj to BO
															bo=new EmployeeBO();
															bo.setEno(rs.getInt(1));
															bo.setEname(rs.getString(2));
															bo.setJob(rs.getString(3));
															bo.setSalary(rs.getInt(4));
															
															return bo;
														}//mapRow(-,-)
			                                  		}//inner clss
		                               ); //method call
		 return bo;
	}//method
	
	public int register(EmployeeBO bo) {
		BeanPropertySqlParameterSource bean=null;
		int count=0;
		//prepare param value
		bean=new BeanPropertySqlParameterSource(bo);
		//execute the Query
		count=njt.update(INSERT_EMP_DETAILS, bean);
	 		return count;
	}

}
