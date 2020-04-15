package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class ListStudentController extends AbstractController {
	private StudentService service;

	public void setService(StudentService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		 List<StudentDTO> listDTO=null;
       //use Service class	
		 listDTO=service.listStudents();
		//return MAV
		 return new ModelAndView("list_students","listStuds",listDTO);
	}//method
}//class
