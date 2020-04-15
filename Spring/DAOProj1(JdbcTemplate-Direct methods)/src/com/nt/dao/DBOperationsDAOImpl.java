package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class DBOperationsDAOImpl implements DBOperationsDAO {
	private static final String EMP_INSERT_QUERY="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL) VALUES(?,?,?,?)";
	private static final String GET_EMP_SALARY_BY_NO="SELECT SAL FROM EMP WHERE EMPNO=?";
	private static final String UPDATE_EMP_SALARY_BY_NO="UPDATE EMP SET SAL=? WHERE EMPNO=?";
	private static final String GET_EMP_DETAILS_BY_NO="SELECT EMPNO,ENAME,SAL,JOB FROM EMP WHERE EMPNO=?";
	private static final String  GET_EMP_DETAILS_BY_DESG="SELECT EMPNO,ENAME,SAL,JOB FROM EMP WHERE JOB=?";
	private static final String DELETE_EMP_BY_NO="DELETE FROM EMP WHERE EMPNO=?";
   private JdbcTemplate jt;

public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}
	@Override
	public int insertEmp(int empno, String ename, String job, int salary) {
	    int cnt=0;
	    cnt=jt.update(EMP_INSERT_QUERY, empno,ename,job,salary);
		return cnt;
	}

	@Override
	public int fetchEmpSalary(int empno) {
		int salary=0;
		salary=jt.queryForObject(GET_EMP_SALARY_BY_NO, Integer.class,empno);
		return salary;
	}

	@Override
	public int updateEmpSalary(int empno, int newSalary) {
       int cnt=0;
       cnt=jt.update(UPDATE_EMP_SALARY_BY_NO,newSalary,empno);
		return cnt;
	}

	@Override
	public Map<String, Object> fetchEmpDetails(int empno) {
		Map<String,Object> empDetails=null;
		empDetails=jt.queryForMap(GET_EMP_DETAILS_BY_NO,empno);
		return empDetails;
	}

	@Override
	public List<Map<String, Object>> fetchEmpDetailsbyDesg(String job) {
		List<Map<String,Object>> empDetails;
		empDetails=jt.queryForList(GET_EMP_DETAILS_BY_DESG, job);
		return empDetails;
	}

	@Override
	public int deletEmp(int empno) {
		int cnt=0;
		cnt=jt.update(DELETE_EMP_BY_NO, empno);
		return cnt;
	}

}
