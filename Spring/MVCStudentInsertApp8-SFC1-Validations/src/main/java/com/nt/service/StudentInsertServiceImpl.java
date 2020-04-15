package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentInsertDAO;
import com.nt.dto.StudentDTO;

public class StudentInsertServiceImpl implements StudentInsertService {
   private StudentInsertDAO dao;
   
	public void setDao(StudentInsertDAO dao) {
	  this.dao = dao;
    }

	@Override
	public String register(StudentDTO dto) {
		StudentBO bo=null;
		int count=0;
		//convert DTO to BO
		bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		//use DAO
		count=dao.insert(bo);
		if(count==0)
			return "Registration Failed";
		else
			return "Registration succeded";
	}//method
}//class
