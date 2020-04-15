package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao;

	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}
	
	public List<StudentDTO> seachStudentByAddrs(String addrs) {
		List<StudentBO> listBO=null;
		List<StudentDTO> listDTO=null;
		StudentDTO dto=null;
		
		//use DAO
		listBO=dao.getStudentByAddrs(addrs);
		//convert ListBO to ListDTO
		listDTO=new ArrayList<StudentDTO>();
		for(StudentBO bo:listBO){
			dto=new StudentDTO();
			dto.setSno(bo.getSno());
			dto.setSname(bo.getSname());
			dto.setSadd(bo.getSadd());
			listDTO.add(dto);
		}
			return listDTO; 
	}//method
}
