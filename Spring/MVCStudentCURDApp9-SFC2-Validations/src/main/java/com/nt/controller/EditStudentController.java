package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCmd;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class EditStudentController extends SimpleFormController {
	
	private StudentService service=null;
	
	 public void setService(StudentService service) {
			this.service = service;
		}


	@Override
	public Object formBackingObject(HttpServletRequest request) throws Exception {
		 StudentDTO dto=null;
		 StudentCmd stCmd=null;
		 int no=0;
		 //get Student no from reequest
		 no=Integer.parseInt(request.getParameter("no"));
		//use SErvice class
		 dto=service.retriveStudentByNo(no);
		 //create and return Command class obj with dynamic data
		 stCmd=new StudentCmd();
		 stCmd.setSno(dto.getSno());
		 stCmd.setSname(dto.getSname());
		 stCmd.setSadd(dto.getSadd());
		 return stCmd;
	}//method

	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		StudentCmd cmd=null;
		StudentDTO dto=null;
		String result=null;
		//type casting of Command obj
		cmd=(StudentCmd)command;
		//convert  Command obj DTO obj
		dto=new StudentDTO();
		dto.setSno(cmd.getSno());
		dto.setSname(cmd.getSname());
		dto.setSadd(cmd.getSadd());
		//use service
		result=service.modifyStudentByNo(dto);
		
  	  return new ModelAndView("edit_success","edit_result",result);
	}

}
