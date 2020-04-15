package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	

	private EmployeeDAO dao=null;
	
	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}
	
	public EmployeeDTO getEmpDetailsByNo(int no) {
		EmployeeDTO dto=null;
		EmployeeBO bo=null;
		//use DAO
		bo=dao.findEmpDetails(no);
		//convert BO to DTO
		dto=new EmployeeDTO();
		dto.setEno(bo.getEno());
		dto.setEname(bo.getEname());
		dto.setJob(bo.getJob());
		dto.setSalary(bo.getSalary());
		return dto;
	}
	
	public String getEmpName(int no) {
		String name=null;
		//use DAO
		name=dao.findName(no);
		return name;
	}
	
	public String registerEmpDetails(EmployeeDTO dto) {
		EmployeeBO bo=null;
		int count=0;
		//convert DTO to BO
		bo=new EmployeeBO();
		bo.setEno(dto.getEno());
		bo.setEname(dto.getEname());
		bo.setJob(dto.getJob());
		bo.setSalary(dto.getSalary());
		//use DAO
		count=dao.register(bo);
		if(count==0)
			return "Registration Failed";
		else
			return "Registration Success";
			
	}//method
}//class
