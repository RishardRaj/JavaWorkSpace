package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmployeeService {
	
	public  EmployeeDTO findEmployeeByNo(int no);
	public List<EmployeeDTO> findEmployeesByDesg(String desg);
	

}
