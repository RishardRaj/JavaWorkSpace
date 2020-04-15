package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpSearchDAOImpl implements EmpSearchDAO {

	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	
@Override
public List<Map<String, Object>> getEmpDetailsByDesg(String cond) {
   List<Map<String,Object>> map=null;
	String QUERY="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN "+cond+" ORDER BY JOB";
    map=jt.queryForList(QUERY);
	return map;
}
}
