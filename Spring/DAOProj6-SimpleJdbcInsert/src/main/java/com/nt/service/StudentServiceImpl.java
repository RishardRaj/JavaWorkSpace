package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
 private StudentDAO dao;

public void setDao(StudentDAO dao) {
	this.dao = dao;
}

	public String register(StudentDTO dto) {
		StudentBO bo=null;
		int count=0;
		//covert DTO into BO
		bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		//use DAO
		count=dao.insert(bo);
		if(count==0)
			return "Registration failed";
		else
			return "Registration succeded";
	}//register(-)
}//class

