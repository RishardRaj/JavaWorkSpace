package com.nt.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
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
	public String showForm(Map<String,UserCommand> map){
		map.put("userCmd", new UserCommand());
		return "login"; 
	}
	
	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	public String processForm(@ModelAttribute("userCmd") UserCommand cmd,Map<String,String> map){
		UserDTO dto=null;
		String resultMsg=null;
		//covert  command obj to DTO obj
		dto=new UserDTO();
		BeanUtils.copyProperties(cmd,dto);
		//use Serivce 
		resultMsg=service.process(dto);
		//keep results in Model Attribute
		map.put("result",resultMsg);
		return "login";
	}
	
	

}
