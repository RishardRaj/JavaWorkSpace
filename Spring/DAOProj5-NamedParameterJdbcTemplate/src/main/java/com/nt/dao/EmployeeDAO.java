package com.nt.dao;

import com.nt.bo.EmployeeBO;

public interface EmployeeDAO {
	
	public String findName(int eno);
	public EmployeeBO findEmpDetails(int eno);
	public int  register(EmployeeBO bo);

}
