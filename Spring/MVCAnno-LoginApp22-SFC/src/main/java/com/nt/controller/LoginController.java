package com.nt.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.UserCommand;
import com.nt.dto.UserDTO;
import com.nt.service.LoginService;

@Controller
public class LoginController {
	@Resource
	private LoginService service;

	@RequestMapping(value="/login.htm",method=RequestMethod.GET)
	public String showForm(Map<String,UserCommand>map){
		UserCommand cmd=null;
		cmd=new UserCommand();
		cmd.setUname("raja"); cmd.setPwd("rani");
		//keep Command class obj as model attribute
		map.put("userCmd",cmd);
		return "login";
	}
	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	public String processForm(Map<String,String> map,@ModelAttribute("userCmd")UserCommand cmd){
        UserDTO dto=null;
        String result=null;
		//convert Command obj to DTO obj
        dto=new UserDTO();
        dto.setUname(cmd.getUname());
        dto.setPwd(cmd.getPwd());
        //user Serivce class
        result=service.authenticate(dto);
        //keep result model attribute
        map.put("resultMsg", result);
        return "login";
	}
	
	@ModelAttribute("domains")
	public List<String> fetchDomains(){
		List<String> domainsList=null;
		domainsList=new ArrayList<String>();
		domainsList.add("gmail.com");
		domainsList.add("yahoo.com");
		domainsList.add("rediff.com");
		return domainsList;
	}
	
	@InitBinder
	public void myInitBinder(WebDataBinder binder){
		SimpleDateFormat sdf=null;
		sdf=new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class,new CustomDateEditor(sdf,true));
		
	}
	
}///class
