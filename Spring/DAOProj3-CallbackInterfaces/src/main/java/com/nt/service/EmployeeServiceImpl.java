package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO  dao;

	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}

	public EmployeeDTO findEmployeeByNo(int no) {
		EmployeeBO  bo=null;
		EmployeeDTO dto=null;
		//use DAO
		bo=dao.getEmpDetailsByNo(no);
		//convert BO into DTO
		dto=new EmployeeDTO();
		dto.setNo(bo.getNo());
		dto.setName(bo.getName());
		dto.setJob(bo.getJob());
		dto.setSalary(bo.getSalary());
		return dto;
	}

	public List<EmployeeDTO> findEmployeesByDesg(String desg) {
		List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=null;
		EmployeeDTO dto=null;
		//use DAO
		listBO=dao.getEmpDetailsByDesg(desg);
		//convert ListBO to listDTO
		listDTO=new ArrayList<EmployeeDTO>();
		for(EmployeeBO bo:listBO){
			dto=new EmployeeDTO();
			dto.setNo(bo.getNo());
			dto.setName(bo.getName());
			dto.setJob(bo.getJob());
			dto.setSalary(bo.getSalary());
			//add DTO to list
			listDTO.add(dto);
		}//for
		return listDTO;
	}//method
}//class
