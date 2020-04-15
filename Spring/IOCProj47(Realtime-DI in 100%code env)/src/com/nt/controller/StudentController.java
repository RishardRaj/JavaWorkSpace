package com.nt.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;
import com.nt.vo.StudentVO;

@Component("stController")
public class StudentController {
	@Resource(name="stService")
	private StudentService service;
	
	private  StudentController(){
		System.out.println("StudentController:0-param constructor");
	}
	//setter method for setter injection
	public void setService(StudentService service) {
		this.service = service;
	}

	public String process(String sno,String sname,String m1,String m2,String m3)throws Exception{
		StudentVO  vo=null;
		StudentDTO dto=null;
		String result=null;
		//prepare VO obj
		vo=new StudentVO();
		vo.setSno(sno);
		vo.setSname(sname);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		//convert VO obj to DTO obj
		dto=new StudentDTO();
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		//use Service class
		result=service.generateResult(dto);
		return result;
	}//method
}//class
