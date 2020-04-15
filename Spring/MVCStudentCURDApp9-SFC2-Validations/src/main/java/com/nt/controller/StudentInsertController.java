package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCmd;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class StudentInsertController extends SimpleFormController {
  private StudentService service;
	public void setService(StudentService service) {
	this.service = service;
}
	
	
	
	
	@Override
	public ModelAndView handleInvalidSubmit(HttpServletRequest request, HttpServletResponse response)
				throws Exception {
		return new ModelAndView("dblpost");
		}
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object cmd,
			BindException errors) throws Exception {
		StudentCmd command=null;
		StudentDTO dto=null;
		String result=null;
		
		//convert Command obj to DTO obj
		command=(StudentCmd)cmd;
		//Application Logic errors
		if(command.getSadd().equals("pakistan") ||command.getSadd().equals("china")){
			errors.rejectValue("sadd","sadd.blockPlace");
		  return showForm(request, response,errors);
		 }
		dto=new StudentDTO();
		dto.setSno(command.getSno());
		dto.setSname(command.getSname());
		dto.setSadd(command.getSadd());
		//use Service
		result=service.register(dto);
		
		return new ModelAndView("result","resMsg",result);
	}//onSubmit(-,-,-,-)

}//class
