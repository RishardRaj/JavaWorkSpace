package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface DBOperationsDAO {
	public int  insertEmp(int empno,String ename,String job,int salary);
	public int  fetchEmpSalary(int empno);
	public int updateEmpSalary(int empno,int newSalary);
	public Map<String,Object> fetchEmpDetails(int empno);
	public List<Map<String,Object>> fetchEmpDetailsbyDesg(String desg);
	public int deletEmp(int empno);
}
