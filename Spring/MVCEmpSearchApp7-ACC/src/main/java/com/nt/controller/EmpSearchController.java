package com.nt.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.nt.command.SearchCommand;
import com.nt.dto.SearchDTO;
import com.nt.dto.SearchResultDTO;
import com.nt.service.EmpSearchService;
public class EmpSearchController extends AbstractCommandController {
  private EmpSearchService service=null;
  
public void setService(EmpSearchService service) {
	this.service = service;
  }
	@Override
	public ModelAndView handle(HttpServletRequest req, HttpServletResponse res, Object cmd, BindException be)
			throws Exception {
		SearchDTO dto=null;
		SearchCommand command=null;
		List<SearchResultDTO> listRDTO=null;
		//convert command obj to DTO object
		command=(SearchCommand)cmd;
		dto=new SearchDTO();
		dto.setNo(command.getNo());
		dto.setName(command.getName());
		dto.setJob(command.getJob());
		dto.setSalary(command.getSalary());
		//use Serivce class
		listRDTO=service.process(dto);
		//create and return MAV
		return new ModelAndView("list_emps","empList",listRDTO);
	}//handle(-,-,-,-)
 }//class
