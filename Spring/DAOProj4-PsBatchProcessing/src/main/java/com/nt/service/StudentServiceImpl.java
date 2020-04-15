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

	public String registerStudents(List<StudentDTO> listDTO) {
		int result[]=null;
		List<StudentBO> listBO=null;
		StudentBO bo=null;
		
		//convert ListDTO to ListBO
		listBO=new ArrayList<StudentBO>();
		for(StudentDTO dto:listDTO){
			bo=new StudentBO();
			bo.setSno(dto.getSno());
			bo.setSname(dto.getSname());
			bo.setSadd(dto.getSadd());
			listBO.add(bo);
		}
		  //use DAO
		result=dao.bulkInsert(listBO);
		if(result!=null)
			return "Registration Success";
		else
			return "Registration failed";
	}//method
}//class
