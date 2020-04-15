package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao;

	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}

	public StudentDTO getStudentByNo(int no) {
		StudentBO bo=null;
		StudentDTO dto=null;
		//use dao class
		bo=dao.getStudentDetailsByNo(no);
		//convert BO to DTO
		dto=new StudentDTO();
		dto.setSno(bo.getSno());
		dto.setSname(bo.getSname());
		dto.setSadd(bo.getSadd());
		
		return dto;
	}

}
