package com.nt.service;

import com.nt.dto.EmployeeDTO;

public interface EmployeeService {
	public String getEmpName(int no);
	public EmployeeDTO getEmpDetailsByNo(int no);
	public String registerEmpDetails(EmployeeDTO dto);

}
