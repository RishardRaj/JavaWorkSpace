package com.nt.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeViewController {

	@RequestMapping("/home.htm")
	public String showHomePage(Map<String,Object> map){
		
		map.put("sysDate", new Date());
		return "welcome";
		
	}
}
