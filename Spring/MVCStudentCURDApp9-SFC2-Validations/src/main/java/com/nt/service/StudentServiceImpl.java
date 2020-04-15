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
	@Override
		public List<StudentDTO> listStudents() {
		   List<StudentBO> listBO=null;
		   List<StudentDTO> listDTO=null;
		   StudentDTO dto=null;
		  //use DAO
		   listBO=dao.getAllStudents();
		   listDTO=new ArrayList<StudentDTO>();
		   for(StudentBO bo:listBO){
			   dto=new StudentDTO();
			   dto.setSno(bo.getSno());
			   dto.setSname(bo.getSname());
			   dto.setSadd(bo.getSadd());
			   listDTO.add(dto);
		   }//for
		   return listDTO;
		}//method
	
	@Override
		public StudentDTO retriveStudentByNo(int no) {
		  StudentBO bo=null;
		  StudentDTO dto=null;
		  //use DAO
		  bo=dao.getStudentByNo(no);
		  //convert BO obj to DTO object
		  dto=new StudentDTO();
		  dto.setSno(bo.getSno());
		  dto.setSname(bo.getSname());
		  dto.setSadd(bo.getSadd());
          return dto;
		}
	@Override
		public String modifyStudentByNo(StudentDTO dto) {
		   StudentBO bo=null;
		   int count=0;
		   //convert DTO obj to BO object
		   bo=new StudentBO();
		   bo.setSno(dto.getSno());
		   bo.setSname(dto.getSname());
		   bo.setSadd(dto.getSadd());
		   //use dAO
		   count=dao.update(bo);
		   if(count==0)
			   return "Updation Failed";
		   else
			   return "Updation Successfull";
		}//method
}//class
