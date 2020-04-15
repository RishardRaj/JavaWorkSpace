package com.nt.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.command.SearchCommand;
import com.nt.dto.SearchDTO;
import com.nt.dto.SearchResultDTO;
import com.nt.service.EmpSearchService;

@Controller
public class EmpSearchController {
	@Resource
	private EmpSearchService service;
	
	@RequestMapping("/searchEmps.htm")
	public String search(Map<String,List<SearchResultDTO>> map,
			             @ModelAttribute SearchCommand cmd){
		SearchDTO dto=null;
		List<SearchResultDTO> listRDTO=null;
		//Convert Command to DTO
		dto=new SearchDTO();
		dto.setNo(cmd.getNo());
		dto.setName(cmd.getName());
		dto.setJob(cmd.getJob());
		dto.setSalary(cmd.getSalary());
		//use Service class
		listRDTO=service.process(dto);
		//keep reusults in Map obj
		map.put("empList",listRDTO);
		//retunr lvn
		return "list_emps";
	}

}
