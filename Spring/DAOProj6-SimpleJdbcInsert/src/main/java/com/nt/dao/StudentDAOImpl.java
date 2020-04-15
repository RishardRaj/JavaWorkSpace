package com.nt.dao;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private SimpleJdbcInsert  sji;

	public void setSji(SimpleJdbcInsert sji) {
		this.sji = sji;
	}

	public int insert(StudentBO bo) {
		/* approach1
		  Map<String,Object> map=null;
		int cnt=0;
	     //prepare col names, col values
		map=new HashMap<String,Object>();
		map.put("sno",bo.getSno());
		map.put("sname", bo.getSname());
		map.put("sadd",bo.getSadd());
		//set table name
		sji.setTableName("student");
		//call execute(-)
		cnt=sji.execute(map);*/
		
		/*  Approach2
		  MapSqlParameterSource inputs=null;
		int cnt=0;
		//prepare col names and col values
		inputs=new MapSqlParameterSource();
		inputs.addValue("sno",bo.getSno());
		inputs.addValue("sname",bo.getSname());
		inputs.addValue("sadd",bo.getSadd());
		//set Table name
		sji.setTableName("student");
		//call execute(-)
		cnt=sji.execute(inputs);*/
		 //approach3
		int cnt=0;
		BeanPropertySqlParameterSource inputs=null;
		 //prepare col names, col values
		inputs=new BeanPropertySqlParameterSource(bo);
		//set table name
		sji.setTableName("student");
		//call execute(-)
		cnt=sji.execute(inputs);
		return cnt;
	}//insert(-)

}//class
