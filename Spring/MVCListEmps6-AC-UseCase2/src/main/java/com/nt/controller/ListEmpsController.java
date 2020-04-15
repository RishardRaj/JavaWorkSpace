package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.EmployeeDTO;
import com.nt.service.ListEmpsService;

public class ListEmpsController extends AbstractController {
 private ListEmpsService service=null;
  public void setService(ListEmpsService service) {
	this.service = service;
  }
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
       List<EmployeeDTO> listDTO=null;
		//use SErvice class
		listDTO=service.getAllEmps();
		//return  MAV
		return new ModelAndView("listEmps","empList",listDTO);
		
		
	}

}
